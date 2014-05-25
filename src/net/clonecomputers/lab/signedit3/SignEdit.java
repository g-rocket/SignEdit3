package net.clonecomputers.lab.signedit3;

import org.bukkit.event.block.*;
import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class SignEdit extends JavaPlugin {
	EditBeginListener editBeginListener = new EditBeginListener();
	
	public void onDisable() {
		BlockPlaceEvent.getHandlerList().unregister(editBeginListener);
		getLogger().info("SignEdit 3.0 Disabled");
	}

	public void onEnable() {
		getLogger().info("SignEdit 3.0 Enabled");
        this.getServer().getPluginManager().registerEvents(editBeginListener, this);
	}
}
