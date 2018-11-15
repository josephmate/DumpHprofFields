import java.util.*;

public class Main {
	public static void main(String [] args) throws InterruptedException {
		List<SomethingWithFields> array = new ArrayList<>();

		System.out.println("Creating objects");
		// hprof expected output to have at least 1000 entries
		for(int i = 0; i < 10; i++) {
			array.add(new SomethingWithFields(i, String.valueOf(10-i)));
		}
		
		System.out.println("sleeping for 100 minutes");
		// sleep so tool has enough time to generate the hprof file
		for(int i = 0; i < 6*100; i++) { // 100 minutes
			Thread.sleep(10000); // 10 seconds
		}

		// Reference the array so a compiler optimizer cannot conclude to remove the array
		System.out.println(array); 
	}
}

class SomethingWithFields {
	private final int intField;
	private final String stringField;
	
	SomethingWithFields(int intField, String stringField) {
		this.intField = intField;
		this.stringField = stringField;
	}

	@Override
	public String toString() {
		return "intField=" + intField + ", stringField=" + stringField;
	}
}
