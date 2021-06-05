package corepattern.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class DAOFactoryProducerTest {

	@Test
	public void saveEmpToDB() {
		DAOAbstractFactory factory = DAOFactoryProducer.produce("db");
		DAO dao = factory.createDao("emp");
		dao.save();
	}
	
	@Test
	public void saveEmpToXml() {
		DAOAbstractFactory factory = DAOFactoryProducer.produce("xml");
		DAO dao = factory.createDao("emp");
		dao.save();
	}
	
	@Test
	public void saveDeptToXml() {
		DAOAbstractFactory factory = DAOFactoryProducer.produce("xml");
		DAO dao = factory.createDao("dept");
		dao.save();
	}
	
	@Test
	public void saveDeptToDB() {
		DAOAbstractFactory factory = DAOFactoryProducer.produce("db");
		DAO dao = factory.createDao("dept");
		dao.save();
	}

}
