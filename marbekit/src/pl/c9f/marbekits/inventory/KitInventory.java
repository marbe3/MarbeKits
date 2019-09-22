package pl.c9f.marbekits.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import pl.c9f.marbekits.data.Kit;
import pl.c9f.marbekits.data.User;
import pl.c9f.marbekits.manager.KitManager;
import pl.c9f.marbekits.store.Settings;
import pl.c9f.marbekits.util.ColorUtil;
import pl.c9f.marbekits.util.ItemUtil;

public class KitInventory {
	private final User user;
	private final KitManager kitManager;

	public KitInventory(User user, KitManager kitManager) {
		this.user = user;
		this.kitManager = kitManager;
	}
	public void open(Player player) {
		final Inventory inventory = Bukkit.createInventory(player, kitManager.getAmount() / 9, ColorUtil.fixColor(Settings.GUI_NAME));
		for (Kit kit : kitManager.getAllKits()) {
			inventory.addItem(ItemUtil.parseItemStack(kit.getIcon().replace("{COOLDOWN}", user.getCooldowns().get(kit.getName()))));
		}
		player.openInventory(inventory);
	}	
}
