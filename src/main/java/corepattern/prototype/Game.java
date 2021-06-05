package corepattern.prototype;

public class Game implements Cloneable{
	private int id;	
	private String name;
	private Membership mem;
	
Game(){
	
}
	
	//copy constructor
	Game(Game game){
		this.id = game.id;
		this.name = game.name;
		this.mem = new Membership(); // deep cloning
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Game clone() throws CloneNotSupportedException {
		Game game = (Game)super.clone();
		game.setMem(new Membership());
		return game;
	}
	public Membership getMem() {
		return mem;
	}
	public void setMem(Membership mem) {
		this.mem = mem;
	}
	
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", mem=" + mem + "]";
	}
}
