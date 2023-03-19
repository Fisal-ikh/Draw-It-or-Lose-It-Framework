/*
 * Fisal Ikhmayes 
 * 2-2 milestone
 * cs-230
 */

package gamingroom;

public class Entity {
	
	private long id = 0;
	private String name = "";
	
	
	//Makes the constructor private so this class cannot be instantiated
	@SuppressWarnings("unused")
	private Entity() {
		
	}
	
	
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Entity [Id= " + id + ", name= " + name;
	}
	

}
