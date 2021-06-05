package corepattern.abstractfactory;

public class DAOFactoryProducer {
	public static DAOAbstractFactory produce(String factoryType) {
		DAOAbstractFactory factory=null;
		if(factoryType.equals("xml")) {
			factory = new XMLDAOFactory();
		} else if(factoryType.equals("db")) {
			factory = new DBDAOFactory();
		}
		return factory;	
	}
}
