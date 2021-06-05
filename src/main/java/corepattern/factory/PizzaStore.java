package corepattern.factory;

public class PizzaStore {
	
	public Pizza orderPizza(String type) {
		
//		Pizza pizza=null;
//		
//		if(type.equals("cheeze")) {
//			pizza=new CheezePizza();
//		}else if(type.equals("veggi")) {
//			pizza=new VeggiPizza();
//		}else if(type.equals("chicken")) {
//			pizza=new ChickenPizza();
//		}
		
		Pizza pizza= PizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		
		return pizza;
	}

}
