package corepattern.abstractfactory;

public class XMLDAOFactory extends DAOAbstractFactory{

	@Override
	public DAO createDao(String type) {
		DAO dao = null;
		if(type.equals("emp")) {
			dao = new XMLEmpDAO();
		} else if (type.equals("dept")){
			dao = new XMLDeptDAO();
		}
		return dao;
	}

}
