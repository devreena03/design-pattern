package corepattern.abstractfactory;

public class DBEmpDAO implements DAO{

	@Override
	public void save() {
		System.out.println("Saving emp to db");
	}

}
