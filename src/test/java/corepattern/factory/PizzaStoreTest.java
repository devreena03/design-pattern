package corepattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaStoreTest {
	
	PizzaStore store = new PizzaStore();

	@Test
	public void orderVeggiPizaa() {
		Pizza p = store.orderPizza("veggi");
	}
	
	@Test
	public void orderChickenPizaa() {
		Pizza p = store.orderPizza("chicken");
	}
	
	@Test
	public void orderCheezePizaa() {
		Pizza p = store.orderPizza("cheeze");
	}

}
