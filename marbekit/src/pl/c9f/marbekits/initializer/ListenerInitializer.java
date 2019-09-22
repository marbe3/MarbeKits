package pl.c9f.marbekits.initializer;

import java.util.Arrays;

import org.bukkit.event.Listener;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.listener.InventoryClickListener;
import pl.c9f.marbekits.listener.PlayerJoinListener;
import pl.c9f.marbekits.manager.UserManager;

public class ListenerInitializer implements Initializer {

  private final MarbeKitsPlugin plugin;
  private final UserManager userManager;

  public ListenerInitializer(MarbeKitsPlugin plugin, UserManager userManager) {
    this.plugin = plugin;
    this.userManager = userManager;
  }

  @Override
  public void initialize() {
    this.registerListeners(new InventoryClickListener(),
    		new PlayerJoinListener(userManager));
  }

  private void registerListeners(Listener... listeners) {
    Arrays.stream(listeners)
        .forEach(listener ->
            this.plugin.getServer().getPluginManager().registerEvents(listener, plugin));
  }

}