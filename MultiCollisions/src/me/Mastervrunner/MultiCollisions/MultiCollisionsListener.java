package me.Mastervrunner.MultiCollisions;

import org.bukkit.Location;
import org.bukkit.entity.Player;
//import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.ability.CoreAbility;
import com.projectkorra.projectkorra.ability.util.Collision;
import com.projectkorra.projectkorra.configuration.ConfigManager;
import com.projectkorra.projectkorra.event.AbilityCollisionEvent;
import com.projectkorra.projectkorra.firebending.FireBlast;
import com.projectkorra.projectkorra.waterbending.Torrent;

public class MultiCollisionsListener implements Listener{

	@EventHandler
	public void onCollision(AbilityCollisionEvent event){
		Collision collision = event.getCollision();
		
		for(int i = 1; i < 10; i++) {
			String ability1 = ConfigManager.getConfig().getString("Combo"+i+".ability1");
			String ability2 = ConfigManager.getConfig().getString("Combo"+i+".ability2");
			
			
			if(ability1 == null || ability2 == null) {
				break;
			}
			
			Player player = collision.getAbilitySecond().getPlayer();
	    	
	    	Player player2 = collision.getAbilityFirst().getPlayer();
			
		    if (collision.getAbilityFirst().getName().equals(ability1) && collision.getAbilitySecond().getName().equals(ability2)) {

		    	 new MultiCollisions(collision.getAbilitySecond().getPlayer(), collision.getAbilityFirst().getLocation(), i);
		    	 break;
		    	 
		    } else if(collision.getAbilityFirst().getName().equals(ability2) && collision.getAbilitySecond().getName().equals(ability1)) {
		    	new MultiCollisions(collision.getAbilityFirst().getPlayer(), collision.getAbilityFirst().getLocation(), i);
		        break;
		    }   else {
		    	
		    }
		}
	}
	
	
}
