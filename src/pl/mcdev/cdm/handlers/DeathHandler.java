package pl.mcdev.cdm.handlers;

import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import pl.mcdev.cdm.managers.Config;

public class DeathHandler {
	
	public static String handleDeath(DamageCause dc){
		switch(dc){
		case BLOCK_EXPLOSION:
			return Config.BLOCK_EXPLOSION;
		case CONTACT:
			return Config.CONTACT;
		case CUSTOM:
			return Config.CUSTOM;
		case DROWNING:
			return Config.DROWNING;
		case ENTITY_ATTACK:
			return Config.ENTITY_ATTACK;
		case ENTITY_EXPLOSION:
			return Config.ENTITY_EXPLOSION;
		case FALL:
			return Config.FALL;
		case FALLING_BLOCK:
			return Config.FALLING_BLOCK;
		case FIRE:
			return Config.FIRE;
		case FIRE_TICK:
			return Config.FIRE_TICK;
		case LAVA:
			return Config.LAVA;
		case LIGHTNING:
			return Config.LIGHTING;
		case MAGIC:
			return Config.MAGIC;
		case MELTING:
			return Config.MELTING;
		case POISON:
			return Config.POISON;
		case PROJECTILE:
			return Config.PROJECTILE;
		case STARVATION:
			return Config.STARVATION;
		case SUFFOCATION:
			return Config.SUFFOCATION;
		case SUICIDE:
			return Config.SUICIDE;
		case THORNS:
			return Config.THORNS;
		case VOID:
			return Config.VOID;
		case WITHER:
			return Config.WITHER;
		default:
			return null;
		}
	}

}
