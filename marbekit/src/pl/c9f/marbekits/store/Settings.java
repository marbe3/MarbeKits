package pl.c9f.marbekits.store;

import pl.c9f.marbekits.MarbeKitsPlugin;

public class Settings {
	private final MarbeKitsPlugin plugin;
    public static String DATABASE_MYSQL_HOST;
    public static int DATABASE_MYSQL_PORT;
    public static String DATABASE_MYSQL_USER;
    public static String DATABASE_MYSQL_PASS;
    public static String DATABASE_MYSQL_NAME;
    public static String GUI_NAME;
    
    public Settings(MarbeKitsPlugin plugin){
    	this.plugin = plugin;
    }
    public void load() {
    	this.plugin.saveDefaultConfig();
    	DATABASE_MYSQL_HOST = this.plugin.getConfig().getString("mysql.host");
    	DATABASE_MYSQL_PORT = this.plugin.getConfig().getInt("mysql.port");
    	DATABASE_MYSQL_USER = this.plugin.getConfig().getString("dmysql.user");
    	DATABASE_MYSQL_NAME = this.plugin.getConfig().getString("mysql.name");
        DATABASE_MYSQL_PASS = this.plugin.getConfig().getString("mysql.password");
        GUI_NAME = this.plugin.getConfig().getString("gui-name");
    }
}
