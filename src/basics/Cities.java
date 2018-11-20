package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare and define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		// System.out.println(states[0]);
		System.out.println("##########");
		
		// Do Loop: enters the loop THEN tests condition
		int i = 0;
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while (i < 5);
		System.out.println("##########");
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound && n < 5) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("SATE FOUND!");
				stateFound = true;
			}
			n++;
		}
		System.out.println("##########");
		
		// For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println("STATE at " + x + ": " + states[x]);
		}
		System.out.println("##########");
		
		// Declare array
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
	}

}
