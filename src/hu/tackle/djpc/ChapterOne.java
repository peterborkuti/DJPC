package hu.tackle.djpc;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Daniel Javorszky
 */
public class ChapterOne {

	public void ex1_writeNameToConsole() {
		System.out.println("Daniel Javorszky");
	}

	public void ex2_writeNameToConsole10Times() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Daniel Javorszky");
		}
	}

	public void ex3_writeNameToConsole10TimesWithNewLine() {
		for (int i = 0; i < 10; i++) {
			ex1_writeNameToConsole();
		}
	}

	public void ex4_writeParamToConsole(String parameter) {
		System.out.println(parameter);
	}

	public void ex5_writeParamToConsole10Times(String parameter) {
		for (int i = 0; i < 10; i++) {
			ex4_writeParamToConsole(parameter);
		}
	}

	public void ex6_writeNumbersFrom1To1000() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}

	public void ex7_writeEvenNumbersFrom1To1000() {
		for (int i = 2; i <= 1000; i += 2) {
			System.out.println(i);
		}
	}

	public void ex8_writeNumbersDivBy5From1To100() {
		for (int i = 5; i <= 100; i += 5) {
			System.out.println(i);
		}
	}

	/**
	 * Criteria:
	 * Start: 1, End: 100
	 * Divisible by 3, 5
	 * Not divisible by 4, 10
	 */
	public void ex9_writeNumbersAccordingToSpecificCriteria() {
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0 || i % 5 == 0) && (i % 4 != 0 && i % 10 != 0)) {
				System.out.println(i);
			}
		}
	}

	public void ex10_writeArithmeticToConsole() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " " + i * 5 + " " + i * 7);
		}
	}

	public void ex11_write100RandomNamesFromAnArray() {
		Random r = new Random();

		for (int i = 0; i < 20; i++) {
			String firstName = namesArr[r.nextInt(namesArr.length)];
			String lastName = namesArr[r.nextInt(namesArr.length)];

			System.out.println(firstName + " " + lastName);
		}
	}

	public void ex12_writeNamesInOrderToConsole() {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			if (j == namesArr.length) j = 0;

			System.out.println(namesArr[j++]);
		}
	}

	public void ex13_writeNamesInOrderButWriteHelloOnInsteadOfThirdName() {
		String[] updatedNamesArr = Arrays.copyOf(namesArr, namesArr.length);
		updatedNamesArr[2] = "Hello";

		int j = 0;
		for (int i = 0; i < 100; i++) {
			if (j == updatedNamesArr.length) j = 0;

			System.out.println(updatedNamesArr[j++]);
		}
	}

	private String[] namesArr = new String[] {"Bob", "Smith", "Sally", "Jones", "Quentin", "Thomas", "Mangroove", "Joe", "Daniel", "Thomas", "Dustin", "Lucas"};



}
