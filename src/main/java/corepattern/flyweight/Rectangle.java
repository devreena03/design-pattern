package corepattern.flyweight;

public class Rectangle extends Shape {
	
	private String label = "Rectangle";
	
	@Override
	public void draw(int length, int breadth, String fillColor, String fillStyle)  {
		System.out.println(String.format("Drawing %s with %d and %d of %s style with color %s",
				this.label, length, breadth, fillStyle,fillColor));
	}

}
