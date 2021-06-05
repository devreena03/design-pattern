package corepattern.templatemethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataRendererTest {

	@Test
	public void renderXMLdata() {
		DataRenderer renderer = new XMLDataRenderer();
		renderer.render();
	}
	
	@Test
	public void renderCSVdata() {
		DataRenderer renderer = new CSVDataRenderer();
		renderer.render();
	}

}
