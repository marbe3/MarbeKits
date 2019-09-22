package pl.c9f.marbekits.initializer;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.store.Settings;

public class SettingsInitializer implements Initializer {

  private final MarbeKitsPlugin plugin;

  public SettingsInitializer(MarbeKitsPlugin plugin) {
    this.plugin = plugin;
  }

  @Override
  public void initialize() {
    final Settings SETTINGS = new Settings(plugin);
    SETTINGS.load();
  }

}