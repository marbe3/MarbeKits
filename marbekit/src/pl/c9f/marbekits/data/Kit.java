package pl.c9f.marbekits.data;

import org.bukkit.inventory.Inventory;

public class Kit {
	
	private Inventory inventory;
	private String permission;
	private String name;
	private String icon;
	private int cooldown;
	
	public Kit(Inventory inventory, String permission, String name, String icon, int cooldown) {
		this.inventory = inventory;
		this.permission = permission;
		this.name = name;
		this.icon = icon;
		this.cooldown = cooldown;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldownl) {
		this.cooldown = cooldownl;
	}

	

}
