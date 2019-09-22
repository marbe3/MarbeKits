package pl.c9f.marbekits.initializer;

import java.util.Arrays;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.manager.KitManager;
import pl.c9f.marbekits.manager.Manager;
import pl.c9f.marbekits.manager.UserManager;

public class ManagerInitializer implements Initializer {

  private final MarbeKitsPlugin plugin;

  public ManagerInitializer(MarbeKitsPlugin plugin) {
    this.plugin = plugin;
  }

  @Override
  public void initialize() {
    this.loadManagers(new UserManager(plugin),
    				  new KitManager(plugin));
  }

  private void loadManagers(Manager... managers) {
    Arrays.stream(managers)
        .forEach(manager ->
            manager.loadAll());
  }

}