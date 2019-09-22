package pl.c9f.marbekits.initializer;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.store.MYSQL;

public class MYSQLInitializer implements Initializer {

	private final MarbeKitsPlugin plugin;

	public MYSQLInitializer(MarbeKitsPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public void initialize() {
		final MYSQL MYSQL = new MYSQL();
		MYSQL.connect();
	    MYSQL.executeUpdate("CREATE TABLE IF NOT EXISTS `kit_users` (`name` varchar(32) NOT NULL PRIMARY KEY, `cooldowns` varchat(32) NOT NULL);");
	    this.plugin.setMYSQL(MYSQL);
  }

}