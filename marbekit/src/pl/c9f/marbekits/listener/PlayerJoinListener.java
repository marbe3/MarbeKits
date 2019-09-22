package pl.c9f.marbekits.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.c9f.marbekits.manager.UserManager;


public class PlayerJoinListener implements Listener{
    private final UserManager userManager;

    public PlayerJoinListener(UserManager userManager) {
        this.userManager = userManager;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (this.userManager.getUser(event.getPlayer().getName()) == null) this.userManager.createUser(event.getPlayer().getName());
    }
}

