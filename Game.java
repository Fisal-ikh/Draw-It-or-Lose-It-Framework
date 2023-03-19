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
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	

	/**
	 * A list of the active teams
	 */
	private List<Team> teams = new ArrayList<Team>();
	
	
	public Game(long id, String name) {
		super(id, name);
	}
	
	public Team addTeam(String name) {
		
		// a local game instance
		Team team = null;
		
		
		// if found, simply return the existing instance
		// loop through the list of team and check if a team with the same name already exists
		Iterator<Team> teamIterator = teams.iterator();
		while (teamIterator.hasNext()) {
			Team existingTeam = teamIterator.next();
		    if (existingTeam.getName().equals(name)) {
		    	team = existingTeam;
		    }
		}
		// if not found, make a new team instance and add to list of team
		if (team == null) {
			if (team == null) {
	            team = new Team(GameService.getNextTeamId(), name);
	            teams.add(team);		
	        }
		}
		
		// return the new/existing team instance to the caller
		return team;
		
	}
	
	
	@Override
	public String toString() {
		
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}

}
