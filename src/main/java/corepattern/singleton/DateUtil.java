package corepattern.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static DateUtil instance = new DateUtil(); //eagar initilization
	private static volatile DateUtil instance; //for multithreading
	
	//eagar initilization
//	static {
//		instance = new DateUtil();
//	}
	
	private DateUtil() {
		
	}
	
//	public static synchronized DateUtil getInstance() {
//		if(instance==null) {
//			instance = new DateUtil(); //Lazy initialization
//		}
//		return instance;
//	}
	
//	public static DateUtil getInstance() {
//		
//		synchronized(DateUtil.class) { //locking at class level
//			if(instance==null) {
//				instance = new DateUtil(); //Lazy initialization
//			}
//		}
//		
//		return instance;
//	}
	
	public static DateUtil getInstance() {
		if (instance == null) { //locking a class is very expensive hence we only lock at first when it null
			synchronized (DateUtil.class) { 
				if (instance == null) {
					instance = new DateUtil(); // Lazy initialization
				}
			}
		}
		return instance;
	}
	
	//used by deserilizing the object
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException();
	}
}
