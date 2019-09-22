package pl.c9f.marbekits.manager;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.Inventory;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.data.Kit;
import pl.c9f.marbekits.util.ColorUtil;
import pl.c9f.marbekits.util.ItemUtil;

public class KitManager implements Manager{
	private List<Kit> kitList = new ArrayList<>();
	private final MarbeKitsPlugin plugin;
	
	
	public KitManager(MarbeKitsPlugin plugin) {
		this.plugin = plugin;
	}
	@Override
	public void loadAll() {
		final ConfigurationSection cs = plugin.getConfig().getConfigurationSection("kits");
		for(String s : cs.getKeys(false)) {
			List<String> stringItems = plugin.getConfig().getStringList(cs.getName() + "." + s + "." + "items");
			String name = plugin.getConfig().getString(cs.getName() + "." + s + "." + "inventory-name");
			String permission = plugin.getConfig().getString(cs.getName() + "." + s + "." + "permission");
			String icon = plugin.getConfig().getString(cs.getName() + "." + "." + s + "icon");
			int cooldown = plugin.getConfig().getInt(cs.getName() + "." + "." + s + "cooldown");
			Inventory inventory = Bukkit.createInventory(null, stringItems.size() / 9, ColorUtil.fixColor(name));
			for(String i: stringItems) {
				inventory.addItem(ItemUtil.parseItemStack(i));
			}
			kitList.add(new Kit(inventory, permission, s, icon, cooldown));
		}
		
	}
	
	public Kit getKit(String name) {
		for (Kit kit : kitList) {
			if(kit.getIcon().contains(name)) {
				return kit;
			}
		}
		return null;
	}
	
	public List<Kit> getAllKits() {
		return kitList;
	}
	
	public int getAmount() {
		return kitList.size();
	}
}
