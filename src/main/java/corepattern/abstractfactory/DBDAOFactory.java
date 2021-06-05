package corepattern.abstractfactory;

public class DBDAOFactory extends DAOAbstractFactory{

	@Override
	public DAO createDao(String type) {
		DAO dao = null;
		if(type.equals("emp")) {
			dao = new DBEmpDAO();
		} else if (type.equals("dept")){
			dao = new DBDeptDAO();
		}
		return dao;
	}

}
