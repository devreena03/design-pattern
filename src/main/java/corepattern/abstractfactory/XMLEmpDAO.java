package corepattern.abstractfactory;

public class XMLEmpDAO implements DAO{

	@Override
	public void save() {
		System.out.println("Saving emp to xml");
	}

}
