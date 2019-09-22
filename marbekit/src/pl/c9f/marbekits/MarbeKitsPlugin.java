package pl.c9f.marbekits;

import org.bukkit.plugin.java.JavaPlugin;

import pl.c9f.marbekits.data.User;
import pl.c9f.marbekits.initializer.CommandInitializer;
import pl.c9f.marbekits.initializer.ListenerInitializer;
import pl.c9f.marbekits.initializer.MYSQLInitializer;
import pl.c9f.marbekits.initializer.ManagerInitializer;
import pl.c9f.marbekits.initializer.SettingsInitializer;
import pl.c9f.marbekits.manager.KitManager;
import pl.c9f.marbekits.manager.UserManager;
import pl.c9f.marbekits.store.MYSQL;
import pl.c9f.marbekits.util.Enchantments;


public class MarbeKitsPlugin extends JavaPlugin{
	
	private MYSQL MYSQL;
	private User user;
	private KitManager kitManager;
	private UserManager userManager;
	@Override
	public void onEnable() {
		new Enchantments();
		this.user = new User();
		this.kitManager = new KitManager(this);	
		this.userManager = new UserManager(this);
		this.getLogger().info("Loading plugin..");
		final MarbeKitsInitializer initializer = new MarbeKitsInitializer(this.getLogger());
		initializer.addInitializer(
				new ListenerInitializer(this, userManager),
				new SettingsInitializer(this),
				new MYSQLInitializer(this),
				new ManagerInitializer(this),
				new CommandInitializer(this, user, kitManager));
		initializer.initialize();
		this.getLogger().info("Loaded plugin!"); 
	}
	   
	  public static MarbeKitsPlugin getInstance() {
		  return MarbeKitsPlugin.getPlugin(MarbeKitsPlugin.class);
	  }

	public MYSQL getMYSQL() {
		return MYSQL;
	}

	public void setMYSQL(MYSQL mYSQL) {
		MYSQL = mYSQL;
	}
	  
}
