package corepattern.adapter;

public class WeatherAdapter {

	public int findTemprature(int zipcode) {
		String city =null;
		if(zipcode == 600097) {
			city = "chennai";
		} else
			city = "delhi" ;
		
		WeatherFinder finder = new WeatherFinderImpl();
		return finder.find(city); 
	}
}
