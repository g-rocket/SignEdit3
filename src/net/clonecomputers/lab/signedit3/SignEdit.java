package net.clonecomputers.lab.signedit3;

import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class SignEdit extends JavaPlugin {
	public void onDisable() {
		getLogger().info("SignEdit 3.0 doesn't know how to disable itself");
	}

	public void onEnable() {
		getLogger().info("SignEdit 3.0 Enabled");
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new EditBeginListener(), this);
	}
}
