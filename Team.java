/*
 * Fisal Ikhmayes 
 * 2-2 milestone
 * cs-230
 */

package gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	/**
	 * A list of the active teams
	 */
	private List<Player> players = new ArrayList<Player>();
	
	
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	public Player addPlayer(String name) {
		
		// a local Player instance
		Player player = null;
		
		
		// if found, simply return the existing instance
		// loop through the list of Player and check if a Player with the same name already exists
		Iterator<Player> playerIterator = players.iterator();
		while (playerIterator.hasNext()) {
			Player existingPlayer = playerIterator.next();
		    if (existingPlayer.getName().equals(name)) {
		    	player = existingPlayer;
		    }
		}
		

		// if not found, make a new Player instance and add to list of Player
		if (player == null) {
			player = new Player(GameService.getNextPlayerId(), name);
			players.add(player);
			
		}
		
		// return the new/existing Player instance to the caller
		return player;
		
	}
	

	
	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}
