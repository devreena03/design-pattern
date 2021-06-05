package corepattern.templatemethod;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "CSV data ";
	}

	@Override
	public String processData(String data) {
		return "processing "+data;
	}

}
