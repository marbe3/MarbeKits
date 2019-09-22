package pl.c9f.marbekits.manager;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.data.User;

public class UserManager implements Manager{

    private final MarbeKitsPlugin plugin;
    private HashMap<String, User> userMap = new HashMap<>();

    public UserManager(MarbeKitsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void loadAll() {
        final ResultSet resultSet = this.plugin.getMYSQL().executeQuery("SELECT * FROM `kit_users`");
        try {
            while (resultSet.next()) {
                final User user = new User(this.plugin, resultSet);
                this.userMap.put(user.getName(), user);
            }
            this.plugin.getLogger().info("Loaded " + this.userMap.size() + " users!");
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createUser(String name) {
        this.userMap.put(name, new User(name));
    }

    public User getUser(String name) {
        return this.userMap
                .values()
                .stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

}
