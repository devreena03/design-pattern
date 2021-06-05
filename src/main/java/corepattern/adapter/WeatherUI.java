package corepattern.adapter;

public class WeatherUI {
	public void showTemprature(int zipcode) {
//		WeatherFinder finder = new WeatherFinderImpl();
//		finder.find(city); //we need adapter to convert zipcode to city
	WeatherAdapter adaptor = new WeatherAdapter();
	System.out.println(adaptor.findTemprature(zipcode));
		
	}
	public static void main(String[] args) {
		new WeatherUI().showTemprature(600097);
	}
}
