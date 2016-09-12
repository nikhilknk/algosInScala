import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class AllpossibleLettersFromT9 {
	public static void main(String[] args) {
		TreeSet<String> allPermutations = generatePermutations(new int[]{8,2,3,4,5,6,7});
		System.out.println(allPermutations.size());
	}

	private static final char keys[][] = { { '0', '0', '0' },
		{ '1', '1', '1' }, { 'A', 'B', 'C' }, { 'D', 'E', 'F' },
		{ 'G', 'H', 'I' }, { 'J', 'K', 'L' }, { 'M', 'N', 'O' },
		{ 'P', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y' } };

	private static final char getCharKey(int telephoneKey, int place) {
		if (place < 1 || place > 3)
			throw new IllegalArgumentException(
					"Argument 'place' is between 1-3 (both inclusive)");
		if (telephoneKey < 0 || telephoneKey > 9)
			throw new IllegalArgumentException(
					"Argument 'telephoneKey' is between 0-9 (both inclusive)");

		return keys[telephoneKey][place - 1];
	}

	static TreeSet<String> generatePermutations(int[] telephoneNumber) {
		TreeSet<String> allPermutations = new TreeSet<String>(); // I want

		getAllPermutation(0,"",allPermutations,telephoneNumber);

		return allPermutations;
	}

	private static void getAllPermutation(int i, String s, Set allPermutations,
			int[] telephoneNumber) {
		if (i < telephoneNumber.length) {
			for (int j = 1; j <= 3; j++) {
				getAllPermutation(i + 1, s + getCharKey(telephoneNumber[i], j),
						allPermutations, telephoneNumber);
			}
		}

		else {
			allPermutations.add(s);
		}
	}
}