package corepattern.prototype;

public class Test {
public static void main(String[] args) throws CloneNotSupportedException {
	Game game = new Game();
	game.setId(1);
	game.setName("Overwatch");
	game.setMem(new Membership());
	
	Game game2 = game.clone();
	System.out.println(game);
	System.out.println(game2);
	
	Game game3 = new Game(game2);
	System.out.println(game3);
}
}
