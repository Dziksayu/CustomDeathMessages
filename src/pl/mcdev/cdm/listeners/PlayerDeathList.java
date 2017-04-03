package pl.mcdev.cdm.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import pl.mcdev.cdm.handlers.DeathHandler;

public class PlayerDeathList implements Listener{
	
	@EventHandler
	public void event(PlayerDeathEvent e){
		if(e.getEntity() instanceof Player){
			e.setDeathMessage(colorized(DeathHandler.handleDeath(e.getEntity().getLastDamageCause().getCause())).replace("%player", e.getEntity().getName()));
		}	
	}
	private String colorized(String s){
		if(s == null) return "wartosc byla pusta";
		return ChatColor.translateAlternateColorCodes('&', s);
	}
}
