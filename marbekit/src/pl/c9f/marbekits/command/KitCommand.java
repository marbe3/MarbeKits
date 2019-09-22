package pl.c9f.marbekits.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.c9f.marbekits.data.User;
import pl.c9f.marbekits.inventory.KitInventory;
import pl.c9f.marbekits.manager.KitManager;


public class KitCommand implements CommandExecutor{
	private final User user;
	private final KitManager kitManager;
	
	public KitCommand(User user, KitManager kitManager) {
		this.user = user;
		this.kitManager = kitManager;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("kit")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("Only for players");
				return true;
			}
			final Player player = (Player) sender;
			final KitInventory inventory = new KitInventory(user, kitManager);
			inventory.open(player);
		}	
		return false;
	}

}
