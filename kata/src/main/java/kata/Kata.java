package kata;

import static java.util.Comparator.comparing;

import java.util.Arrays;

/**
 * Created by NHNEnt on 2017-11-29.
 */
public class Kata {
	public static String longestWord(String wordString) {
		// Give me back the longest word!
		//		return Arrays.stream(wordString.split(" "))
		//					 .sorted(comparing(o -> o.toString().length()))
		//					 .reduce((s, s2) -> s2).get();

		String[] split = wordString.split(" ");
		return Arrays.stream(split)
					 .sorted(comparing(String::length)).skip(split.length - 1).findFirst().get();


		//			 .reduce((s, s2) -> s2).get();

	}


}
