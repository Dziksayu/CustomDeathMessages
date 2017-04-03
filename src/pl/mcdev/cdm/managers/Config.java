package pl.mcdev.cdm.managers;

import org.bukkit.plugin.java.JavaPlugin;

public class Config extends ConfigManager{
	
	public static String BLOCK_EXPLOSION, CONTACT, CUSTOM, DROWNING, ENTITY_ATTACK, ENTITY_EXPLOSION, FALL, FALLING_BLOCK, FIRE, FIRE_TICK, LAVA, LIGHTING, MAGIC,MELTING,
	POISON, PROJECTILE, STARVATION, SUFFOCATION, SUICIDE, THORNS, VOID, WITHER;
	
	static{
		BLOCK_EXPLOSION = "&7%player &7eksplodowal na oczach znajomych.";
		CONTACT = "&3%player &7probowal przytulic kaktusa.";
		CUSTOM = "&3%player &7..(??).";
		DROWNING = "&3%player &7zasnal pod woda.";
		ENTITY_ATTACK = "&3%player &7zginal przez moba.";
		ENTITY_EXPLOSION = "%player &7probowal oswoic creeper'a.";
		FALL = "&3%player &7zapomnial rozwinac spadochron.";
		FALLING_BLOCK = "&3%player &7bawil sie spadajacymi blokami.";
		FIRE = "&3%player &7spalil swoj tylek.";
		FIRE_TICK = "&3%player &7spalil swoj tylek.";
		LAVA = "&3%player &7probowal plywac w lavie.";
		LIGHTING = "&3%player &7zostal potrzelony przez Zeus'a.";
		MAGIC = "&3%player &7przedawkowal potiony.";
		MELTING = "&3%player &7zginal poprzez roztopienie balwana.";
		POISON = "&3%player &7zginal przez nieprawidlowe uzycie poisona.";
		PROJECTILE = "&3%player &7zginal przez strzale.";
		STARVATION = "&3%player &7zapomnial o jedzeniu.";
		SUFFOCATION = "&3%player &7zginal w scianie.";
		SUICIDE = "&3%player &7popelnil samobojstwo.";
		THORNS = "&3%player &7zostal potrzelony przez Zeus'a.";
		VOID = "&3%player &7wypadl poza mape.";
		WITHER = "&3%player &7chcial porozmawiac z wiedzma.";	
	}
	public Config(JavaPlugin plugin) {
        super(plugin, "config.yml", "ustawienia.");
	}
}
