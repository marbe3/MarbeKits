package pl.c9f.marbekits.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import pl.c9f.marbekits.MarbeKitsPlugin;
import pl.c9f.marbekits.util.MapUtil;

public class User {
	private Map<String, String> cooldowns = new HashMap<>();
	private String name;

	public User(String name) {
		this.name = name;
	}

	public User(MarbeKitsPlugin plugin, ResultSet resultSet) throws SQLException {
		this.name = resultSet.getString("name");
		this.setCooldowns(MapUtil.stringToMap(resultSet.getString("cooldowns")));
	}



	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getCooldowns() {
		return cooldowns;
	}

	public void setCooldowns(Map<String, String> cooldowns) {
		this.cooldowns = cooldowns;
	}

}
