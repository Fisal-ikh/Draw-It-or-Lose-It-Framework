/*
 * Fisal Ikhmayes 
 * 2-2 milestone
 * cs-230
 */

package gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-andd-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {		
	    // obtain reference to the singleton instance
	    GameService game = GameService.getInstance();
	    
	    System.out.println("\nAbout to test initializing game data...");
	    
	    // initialize with some game data
	    Game game1 = game.addGame("Game #1");
	    System.out.println(game1);
	    Game game2 = game.addGame("Game #2");
	    System.out.println(game2);
	    
	    
	    // create a team
        Team team1 = new Team(1, "Team 1");
        // add players to the team
        Player player1 = team1.addPlayer("John");
        Player player2 = team1.addPlayer("Mary");
        Player player3 = team1.addPlayer("Tom");
        System.out.println();


        // print the team and its players
        System.out.println(team1);
        System.out.println("Players:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        System.out.println();

        // create another team
        Team team2 = new Team(2, "Team 2");

        // add players to the team
        Player player4 = team2.addPlayer("Bob");
        Player player5 = team2.addPlayer("Alice");

        // print the team and its players
        System.out.println(team2);
        System.out.println("Players:");
        System.out.println(player4);
        System.out.println(player5);
	    
	    
	    // use another class to prove there is only one instance
	    SingletonTester tester = new SingletonTester();
	    tester.testSingleton();
	}
}
