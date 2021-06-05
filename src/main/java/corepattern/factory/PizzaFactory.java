package corepattern.factory;

public class PizzaFactory {
	
	public static Pizza createPizza(String type) {
		Pizza pizza=null;
		
		if(type.equals("cheeze")) {
			pizza=new CheezePizza();
		}else if(type.equals("veggi")) {
			pizza=new VeggiPizza();
		}else if(type.equals("chicken")) {
			pizza=new ChickenPizza();
		}
		 return pizza;
	}

}
