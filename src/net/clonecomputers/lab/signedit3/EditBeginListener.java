package net.clonecomputers.lab.signedit3;

import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;

public class EditBeginListener implements Listener {
	@EventHandler(priority = EventPriority.HIGHEST)
	public void beginEdit(BlockPlaceEvent e){
		Material placedMeta = e.getBlockPlaced().getType();
		Material existingMeta = e.getBlockAgainst().getType();
		
		if(!placedMeta.equals(Material.WALL_SIGN) && !placedMeta.equals(Material.SIGN_POST)) return;
		if(!existingMeta.equals(Material.WALL_SIGN) && !existingMeta.equals(Material.SIGN_POST)) return;
		if(!e.getItemInHand().getType().equals(Material.SIGN)) return;
		if(e.getPlayer().isSneaking()) return;
		
		e.setCancelled(true);
		e.getPlayer().openSign((Sign)e.getBlockAgainst().getState(), true);
	}
}
