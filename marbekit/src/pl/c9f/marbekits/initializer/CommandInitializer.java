package pl.c9f.marbekits.initializer;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.command.KitCommand;
import pl.c9f.marbekits.data.User;
import pl.c9f.marbekits.manager.KitManager;

public class CommandInitializer implements Initializer {

  private final MarbeKitsPlugin plugin;
  private final User user;
  private final KitManager kitManager;

  public CommandInitializer(MarbeKitsPlugin plugin, User user, KitManager kitManager) {
    this.plugin = plugin;
    this.user = user;
    this.kitManager = kitManager;
  }

  @Override
  public void initialize() {
	  plugin.getCommand("kit").setExecutor(new KitCommand(user, kitManager));
  }
  


}