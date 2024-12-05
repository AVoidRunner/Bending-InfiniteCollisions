package me.Mastervrunner.MultiCollisions;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.projectkorra.projectkorra.GeneralMethods;
import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.ability.AddonAbility;
import com.projectkorra.projectkorra.ability.CoreAbility;
import com.projectkorra.projectkorra.ability.FireAbility;
import com.projectkorra.projectkorra.ability.util.Collision;
import com.projectkorra.projectkorra.configuration.Config;
import com.projectkorra.projectkorra.configuration.ConfigManager;
import com.projectkorra.projectkorra.firebending.FireBlast;
import com.projectkorra.projectkorra.util.DamageHandler;
import com.projectkorra.projectkorra.util.ParticleEffect;
import com.projectkorra.projectkorra.waterbending.Torrent;

public class MultiCollisions extends FireAbility implements AddonAbility{
	
	private Location location;
	private Location origin;
	private Vector direction;
	
	private double dmg = 2;
	private double dmgRadius = 5;
	
	private double dmgKnockBack = 5;

	public MultiCollisions(Player player, Location originn, int i) {
		super(player);
		// TODO Auto-generated constructor stub
		
		setFields(originn);
		String particles = ConfigManager.getConfig().getString("Combo"+i+".particles");
		
		
		
		if(particles.contains(",")) {

			String[] particleArray = particles.split(",");
			
			for(int x = 0; x < particleArray.length; x++) {
				
				String thisParticle = particleArray[x].toUpperCase();
				ParticleEffect myParticle;
				
				if(thisParticle.equals("ASH") ) {
						ParticleEffect.BARRIER.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				if(thisParticle.equals("BARRIER") ) {
						ParticleEffect.BARRIER.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				if(thisParticle.equals("BLOCK_CRACK") ) {
						ParticleEffect.BLOCK_CRACK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				if(thisParticle.equals("BLOCK_DUST") ) {
						ParticleEffect.BLOCK_DUST.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("BUBBLE_COLUMN_UP") ) {
						ParticleEffect.BUBBLE_COLUMN_UP.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("BUBBLE_POP") ) {
						ParticleEffect.BUBBLE_POP.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("CLOUD")) /*)*/ {
						ParticleEffect.CLOUD.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("CRIT") ) {
						ParticleEffect.CRIT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("CRIT_MAGIC") ) {
						ParticleEffect.CRIT_MAGIC.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("CURRENT_DOWN") ) {
						ParticleEffect.CURRENT_DOWN.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("DAMAGE_INDICATOR") ) {
						ParticleEffect.DAMAGE_INDICATOR.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("DOLPHIN") ) {
						ParticleEffect.DOLPHIN.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("DRAGON_BREATH") ) {
						ParticleEffect.DRAGON_BREATH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
				}
				else if(thisParticle.equals("DRIP_LAVA")){
						ParticleEffect.DRIP_LAVA.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("DRIP_WATER")){
						ParticleEffect.DRIP_WATER.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("ENCHANTMENT_TABLE")){
						ParticleEffect.ENCHANTMENT_TABLE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
				}
				else if(thisParticle.equals("END_ROD")){
						ParticleEffect.END_ROD.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("EXPLOSION_HUGE")){
						ParticleEffect.EXPLOSION_HUGE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("EXPLOSION_LARGE")){
						ParticleEffect.EXPLOSION_LARGE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);

				}
				else if(thisParticle.equals("EXPLOSION_NORMAL")){
						ParticleEffect.EXPLOSION_NORMAL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("FALLING_DUST")){
						ParticleEffect.FALLING_DUST.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("FIREWORKS_SPARK"))/*)*/{
						ParticleEffect.FIREWORKS_SPARK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
				}
				else if(thisParticle.equals("FLAME")){
						ParticleEffect.FLAME.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("HEART")){
						ParticleEffect.HEART.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("ITEM_CRACK")){
						ParticleEffect.ITEM_CRACK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("LAVA")){
						ParticleEffect.LAVA.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("MOB_APPEARANCE")){
						ParticleEffect.MOB_APPEARANCE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("NAUTILUS")){
						ParticleEffect.NAUTILUS.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("NOTE")){
						ParticleEffect.NOTE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("PORTAL")){
						ParticleEffect.PORTAL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("REDSTONE")){
						ParticleEffect.REDSTONE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				//
				else if(thisParticle.equals("SLIME")){
						ParticleEffect.SLIME.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SMOKE_LARGE")){
						ParticleEffect.SMOKE_LARGE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SMOKE_NORMAL")){
						ParticleEffect.SMOKE_NORMAL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SNOW_SHOVEL")){
						ParticleEffect.SNOW_SHOVEL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SNOWBALL")){
						ParticleEffect.SNOWBALL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SPELL")){
						ParticleEffect.SPELL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SPELL_INSTANT")){
						ParticleEffect.SPELL_INSTANT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SPELL_MOB")){
						ParticleEffect.SPELL_MOB.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SPELL_MOB_AMBIENT")){
						ParticleEffect.SPELL_MOB_AMBIENT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SPELL_WITCH")){
						ParticleEffect.SPELL_WITCH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SPIT")){
						ParticleEffect.SPIT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SQUID_INK")){
						ParticleEffect.SQUID_INK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SUSPENDED")){
						ParticleEffect.SUSPENDED.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("SUSPENDED_DEPTH")){
						ParticleEffect.SUSPENDED_DEPTH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
						
				}
				else if(thisParticle.equals("SWEEP_ATTACK")){
						ParticleEffect.SWEEP_ATTACK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("TOTEM")){
						ParticleEffect.TOTEM.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						//}
				}
				else if(thisParticle.equals("TOWN_AURA")){
						ParticleEffect.TOWN_AURA.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("VILLAGER_ANGRY")){
						ParticleEffect.VILLAGER_ANGRY.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("VILLAGER_HAPPY")){
						ParticleEffect.VILLAGER_HAPPY.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("WATER_BUBBLE")){
						ParticleEffect.WATER_BUBBLE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("WATER_DROP")){
						ParticleEffect.WATER_DROP.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("WATER_SPLASH")){
						ParticleEffect.WATER_SPLASH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
				else if(thisParticle.equals("WATER_WAKE")){
						ParticleEffect.WATER_WAKE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
						
						
				}
								
			}
			
		} else {
			
			String thisParticle = particles;
			
			if(thisParticle.equals("ASH") ) {
				ParticleEffect.BARRIER.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
				
				
			}
			if(thisParticle.equals("BARRIER") ) {
					ParticleEffect.BARRIER.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			if(thisParticle.equals("BLOCK_CRACK") ) {
					ParticleEffect.BLOCK_CRACK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			if(thisParticle.equals("BLOCK_DUST") ) {
					ParticleEffect.BLOCK_DUST.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("BUBBLE_COLUMN_UP") ) {
					ParticleEffect.BUBBLE_COLUMN_UP.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("BUBBLE_POP") ) {
					ParticleEffect.BUBBLE_POP.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("CLOUD")) /*)*/ {
					ParticleEffect.CLOUD.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
			}
			else if(thisParticle.equals("CRIT") ) {
					ParticleEffect.CRIT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("CRIT_MAGIC") ) {
					ParticleEffect.CRIT_MAGIC.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("CURRENT_DOWN") ) {
					ParticleEffect.CURRENT_DOWN.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("DAMAGE_INDICATOR") ) {
					ParticleEffect.DAMAGE_INDICATOR.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("DOLPHIN") ) {
					ParticleEffect.DOLPHIN.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("DRAGON_BREATH") ) {
					ParticleEffect.DRAGON_BREATH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					// \
					
			}
			else if(thisParticle.equals("DRIP_LAVA")){
					ParticleEffect.DRIP_LAVA.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("DRIP_WATER")){
					ParticleEffect.DRIP_WATER.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("ENCHANTMENT_TABLE")){
					ParticleEffect.ENCHANTMENT_TABLE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
			}
			else if(thisParticle.equals("END_ROD")){
					ParticleEffect.END_ROD.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("EXPLOSION_HUGE")){
					ParticleEffect.EXPLOSION_HUGE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("EXPLOSION_LARGE")){
					ParticleEffect.EXPLOSION_LARGE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
			}
			else if(thisParticle.equals("EXPLOSION_NORMAL")){
					ParticleEffect.EXPLOSION_NORMAL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("FALLING_DUST")){
					ParticleEffect.FALLING_DUST.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("FIREWORKS_SPARK"))/*)*/{
					ParticleEffect.FIREWORKS_SPARK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
			}
			else if(thisParticle.equals("FLAME")){
					ParticleEffect.FLAME.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("HEART")){
					ParticleEffect.HEART.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("ITEM_CRACK")){
					ParticleEffect.ITEM_CRACK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("LAVA")){
					ParticleEffect.LAVA.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("MOB_APPEARANCE")){
					ParticleEffect.MOB_APPEARANCE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("NAUTILUS")){
					ParticleEffect.NAUTILUS.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("NOTE")){
					ParticleEffect.NOTE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("PORTAL")){
					ParticleEffect.PORTAL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("REDSTONE")){
					ParticleEffect.REDSTONE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			//
			else if(thisParticle.equals("SLIME")){
					ParticleEffect.SLIME.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SMOKE_LARGE")){
					ParticleEffect.SMOKE_LARGE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SMOKE_NORMAL")){
					ParticleEffect.SMOKE_NORMAL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SNOW_SHOVEL")){
					ParticleEffect.SNOW_SHOVEL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SNOWBALL")){
					ParticleEffect.SNOWBALL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SPELL")){
					ParticleEffect.SPELL.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SPELL_INSTANT")){
					ParticleEffect.SPELL_INSTANT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SPELL_MOB")){
					ParticleEffect.SPELL_MOB.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SPELL_MOB_AMBIENT")){
					ParticleEffect.SPELL_MOB_AMBIENT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SPELL_WITCH")){
					ParticleEffect.SPELL_WITCH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SPIT")){
					ParticleEffect.SPIT.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SQUID_INK")){
					ParticleEffect.SQUID_INK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SUSPENDED")){
					ParticleEffect.SUSPENDED.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("SUSPENDED_DEPTH")){
					ParticleEffect.SUSPENDED_DEPTH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
					
			}
			else if(thisParticle.equals("SWEEP_ATTACK")){
					ParticleEffect.SWEEP_ATTACK.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("TOTEM")){
					ParticleEffect.TOTEM.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					//}
			}
			else if(thisParticle.equals("TOWN_AURA")){
					ParticleEffect.TOWN_AURA.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("VILLAGER_ANGRY")){
					ParticleEffect.VILLAGER_ANGRY.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("VILLAGER_HAPPY")){
					ParticleEffect.VILLAGER_HAPPY.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("WATER_BUBBLE")){
					ParticleEffect.WATER_BUBBLE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("WATER_DROP")){
					ParticleEffect.WATER_DROP.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("WATER_SPLASH")){
					ParticleEffect.WATER_SPLASH.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}
			else if(thisParticle.equals("WATER_WAKE")){
					ParticleEffect.WATER_WAKE.display(originn, 100, 0.1, 0.1, 0.1, 0.25);
					
					
			}

		}
		
		dmg = ConfigManager.getConfig().getDouble("Combo"+i+".damageAmount");
		dmgRadius = ConfigManager.getConfig().getDouble("Combo"+i+".damageRadius");
		dmgKnockBack = ConfigManager.getConfig().getDouble("Combo"+i+".damageKnockBack");//yes i typed it all out manually ;) :)
		
		
		
        for (Entity entity : GeneralMethods.getEntitiesAroundPoint(originn, dmgRadius)) {
			/*
			 * The effects we apply to the "entity"
			 * English: If there is an entity which is living and is not equal to the player using the ability, 
			 * the entity will take damage and the ability will stop progressing.
			 */
        	
        	if ((entity instanceof LivingEntity)) {
				DamageHandler.damageEntity(entity, dmg, this);
				
				
				Vector unitVector = entity.getLocation().toVector().subtract(originn.toVector()).normalize();
				
				entity.setVelocity(unitVector.multiply(dmgKnockBack));
			}
        	
		}
        
        remove();
		return;
	}
	
	private void setFields(Location originn) {
	}
	
	@Override
	public void progress() {
		
	}

	@Override
	public long getCooldown() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "You went poof";
	}

	@Override
	public boolean isHarmlessAbility() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSneakAbility() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return "Mastervrunner";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
		ProjectKorra.plugin.getServer().getPluginManager().registerEvents(new MultiCollisionsListener(), ProjectKorra.plugin);
		
		/*
		 * Log message that appears when the ability is loaded.
		 */
		ProjectKorra.log.info("Successfully enabled " + getName() + " by " + getAuthor());
		
		blockAbilities();
		
		ConfigManager.getConfig().addDefault("Combo1.ability1", "Torrent");
		ConfigManager.getConfig().addDefault("Combo1.ability2", "FireBlast");
		ConfigManager.getConfig().addDefault("Combo1.particles", "CLOUD, FIREWORKS_SPARK");
		ConfigManager.getConfig().addDefault("Combo1.cancel", "True");
		ConfigManager.getConfig().addDefault("Combo1.damageAmount", "2");
		ConfigManager.getConfig().addDefault("Combo1.damageRadius", "5");
		
		ConfigManager.getConfig().addDefault("Combo1.damageKnockBack", "5");
		
		ConfigManager.defaultConfig.save();
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		/*
		 * Log message that appears when the ability is disabled.
		 */
		ProjectKorra.log.info("Successfully disabled " + getName() + " by " + getAuthor());
		
		/*
		 * When the server stops or reloads, the ability will stop what it's doing and remove.
		 */
		super.remove();
		
		
	}
	
	private static void blockAbilities() {
        //Main Ability (first)
        CoreAbility mainAbil = CoreAbility.getAbility(Torrent.class);
        
        // EarthSmash (second)
        CoreAbility secondAbil = CoreAbility.getAbility(FireBlast.class);

        ProjectKorra.getCollisionManager().addCollision(new Collision(mainAbil, secondAbil, true, true));
            
    }
	
	
	//So call this with the right class for what they put, then the part where they should or shouldnt collide lol
	//private static void blockAbilitie2s(Class myClass) {
		//private static void blockAbilitie2s(Class myClass) {
	private static void blockAbilitie2s(Class myClass, boolean shouldblock1, boolean shouldblock2) {
        //Main Ability (first)
        CoreAbility mainAbil = CoreAbility.getAbility(Torrent.class);
        
        // EarthSmash (second)
        CoreAbility secondAbil = CoreAbility.getAbility(FireBlast.class);

        ProjectKorra.getCollisionManager().addCollision(new Collision(mainAbil, secondAbil, true, true));
            
    }
	
	@Override
    public void handleCollision(Collision collision) {
		
		Bukkit.broadcastMessage("works");
        
        ParticleEffect.CLOUD.display(collision.getLocationFirst(), 100, 0.1, 0.1, 0.1, 0.25);
        ParticleEffect.FIREWORKS_SPARK.display(collision.getLocationFirst(), 100, 0.1, 0.1, 0.1, 0.25);
        
        collision.getLocationFirst().getWorld().spawnParticle(Particle.REDSTONE, collision.getLocationFirst().getX(), collision.getLocationFirst().getY()+3, collision.getLocationFirst().getZ(), 0, 0.3, 0.1, 0.3, 50, new Particle.DustOptions(Color.fromRGB(41, 175, 242), 50));
        
		
        super.handleCollision(collision);
        
        
    }
	

}
