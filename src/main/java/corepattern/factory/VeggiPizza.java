package corepattern.factory;

public class VeggiPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing VeggiPizza");

	}

	@Override
	public void bake() {
		System.out.println("Baking VeggiPizza");

	}

	@Override
	public void cut() {
		System.out.println("Cutting VeggiPizza");

	}

}
