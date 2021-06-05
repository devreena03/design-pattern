package corepattern.factory;

public class CheezePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing CheezePizza");

	}

	@Override
	public void bake() {
		System.out.println("Baking CheezePizza");

	}

	@Override
	public void cut() {
		System.out.println("Cutting CheezePizza");

	}

}
