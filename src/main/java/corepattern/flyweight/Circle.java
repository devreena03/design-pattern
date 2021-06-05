package corepattern.flyweight;

public class Circle extends Shape {
	
	private String label = "Circle";

	@Override
	public void draw(String fillColor, String lineColor, int radius) {
		System.out.println(String.format("Drawing %s with radius %d with line color %s and fill color %s ",
				label, radius, lineColor,fillColor));
	}

}
