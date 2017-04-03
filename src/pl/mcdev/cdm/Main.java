package pl.mcdev.cdm;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import pl.mcdev.cdm.listeners.PlayerDeathList;
import pl.mcdev.cdm.managers.Config;

public class Main extends JavaPlugin {
	
	private static Main inst;
	private Config config;
	
	@Override
	public void onLoad(){
		inst = this;
		config = new Config(this);
	}
	@Override
	public void onEnable(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PlayerDeathList(), this);
	}
	@Override
	public void onDisable(){
		inst = null;
	}
	public static Main getInst(){
		return inst;
	}
}
