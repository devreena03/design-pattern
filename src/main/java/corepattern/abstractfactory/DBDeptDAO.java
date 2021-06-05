package corepattern.abstractfactory;

public class DBDeptDAO implements DAO{

	@Override
	public void save() {
		System.out.println("Saving dept to db");
	}

}
