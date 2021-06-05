package corepattern.abstractfactory;

public abstract class DAOAbstractFactory {
	public abstract DAO createDao(String type);
}
