package corepattern.singleton;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void sameOject() {
		DateUtil util1 = DateUtil.getInstance();
		DateUtil util2 = DateUtil.getInstance();
		assertTrue(util1==util2);
	}
	
	@Test
	public void serializedObjSame() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("data/dateUtil.ser");
		DateUtil util1 = DateUtil.getInstance();
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
		os.writeObject(util1);
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
		DateUtil util2 = (DateUtil) is.readObject();
		assertTrue(util1==util2);
	}
	
	@Test(expected = CloneNotSupportedException.class)
	public void cloneShouldThrowError() throws Exception {
		DateUtil util1 = DateUtil.getInstance();
		util1.clone();
		//assertTrue(util1==util2); //clone gives different object reference
	}

}
