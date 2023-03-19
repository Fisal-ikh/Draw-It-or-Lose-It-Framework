/*
 * Fisal Ikhmayes 
 * 2-2 milestone
 * cs-230
 */


package gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();
	

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	private static long nextPlayerId = 1;
	
	private static long nextTeamId = 1;
	

	
	/*
	 * The purpose of the Singleton pattern is to ensure that there is only one instance of the class
	 *and it must be externally accessible. 
	 *This design pattern is importance because some systems require only one instance to be created 
	 *for security purposes.
	 *
	 *Source: The Hands-On Design Patterns with Java 
	 */
	
	// creates an object of GameService
	private static GameService instance = new GameService();

	//Makes the constructor private so this class cannot be instantiated
	private GameService(){}
	
	//Get the only object available
	public static GameService getInstance(){ 
		return instance;
	}

	
	
	
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		//Get the only object available
		
		/*
		 * The purpose of the iterator is used to find an element without knowing its underlying 
		 * Implementation details. it does this in sequential order. In this implementation, 
		 * the iterator is used to search for existing games with a given id or name, 
		 * as well as to loop through the list of games to return the game at a specific index.
		 * the implementation of the data structure can be changed without affecting the rest 
		 * of the code that relies on it, as long as the new implementation supports the 
		 * same iteration interface.
		 * 
		 * source: Tutorials Point
		 */
		// if found, simply return the existing instance
		// loop through the list of games and check if a game with the same name already exists
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
		    Game existingGame = gameIterator.next();
		    if (existingGame.getName().equals(name)) {
		    	game = existingGame;
		    }
		}
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
			
		}
		// return the new/existing game instance to the caller
		return game;
	}

	
	
	
	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	
	
	
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {
		// a local game instance
		Game game = null;

		/*
		 * The purpose of the iterator is used to find an element without knowing its underlying 
		 * Implementation details. it does this in sequential order. In this implementation, 
		 * the iterator is used to search for existing games with a given id or name, 
		 * as well as to loop through the list of games to return the game at a specific index.
		 * the implementation of the data structure can be changed without affecting the rest 
		 * of the code that relies on it, as long as the new implementation supports the 
		 * same iteration interface.
		 * 
		 * source: Tutorials Point
		 */
		// Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
		    Game currentGame = gameIterator.next();
		    if (currentGame.getId() == id) {
		        game = currentGame;
		        break;
		    }
		}

	    return game;
	}

	
	
	
	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {
		// a local game instance
		Game game = null;

		
		/*
		 * The purpose of the iterator is used to find an element without knowing its underlying 
		 * Implementation details. it does this in sequential order. In this implementation, 
		 * the iterator is used to search for existing games with a given id or name, 
		 * as well as to loop through the list of games to return the game at a specific index.
		 * the implementation of the data structure can be changed without affecting the rest 
		 * of the code that relies on it, as long as the new implementation supports the 
		 * same iteration interface.
		 * 
		 * source: Tutorials Point
		 */
		// Use iterator to look for existing game with same name
	    // if found, simply assign that instance to the local variable
	    Iterator<Game> gameIterator = games.iterator();
	    while (gameIterator.hasNext()) {
	        Game currentGame = gameIterator.next();
	        if (currentGame.getName().equals(name)) {
	            game = currentGame;
	            break;
	        }
	    }
	    return game;
	}
	
	
	
	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	
	/**
	 * Returns the number of players currently active
	 * 
	 * @return the number of players currently active
	 * i had to make it static so i can increment it in the other classes
	 */
	public static long getNextPlayerId() {
		return nextPlayerId++;
		
	}
	/**
	 * Returns the number of teams currently active
	 * 
	 * @return the number of teams3 currently active
	 * i had to make it static so i can increment it in the other classes
	 * 
	 */
	public static long getNextTeamId() {
		return nextTeamId++;
		
	}
	
	
}

