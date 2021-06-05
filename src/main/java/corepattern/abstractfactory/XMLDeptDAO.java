package corepattern.abstractfactory;

public class XMLDeptDAO implements DAO{

	@Override
	public void save() {
		System.out.println("Saving dept to xml");
	}

}
