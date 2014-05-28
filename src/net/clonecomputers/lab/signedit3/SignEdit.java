package net.clonecomputers.lab.signedit3;

import org.bukkit.block.*;
import org.bukkit.entity.*;
import org.bukkit.event.block.*;
import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class SignEdit extends JavaPlugin {
	EditBeginListener editBeginListener = new EditBeginListener();
	
	public void onDisable() {
		BlockPlaceEvent.getHandlerList().unregister(editBeginListener);
		getLogger().info(String.format("%s %s Disabled", this.getDescription().getName(), this.getDescription().getVersion()));
	}

	public void onEnable() {
		boolean patchApplied;
		try {
			HumanEntity.class.getMethod("openSign", Sign.class, boolean.class);
			patchApplied = true;
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			patchApplied = false;
		}
		if(patchApplied) {
			getLogger().info(String.format("%s %s Enabled", this.getDescription().getName(), this.getDescription().getVersion()));
			this.getServer().getPluginManager().registerEvents(editBeginListener, this);
		} else {
			getLogger().severe("This version of CraftBukkit does not appear to have the sign patch applied");
			getLogger().severe("SignEdit 3 needs this patch to be installed to work");
			getPluginLoader().disablePlugin(this);
		}
	}
}
