package kata;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by NHNEnt on 2017-11-30.
 */
public class JadenCase {

	public String toJadenCase(String phrase) {
		if (phrase == null || "".equals(phrase)) {
			return null;
		}
		return Stream.of(phrase.split(" "))
					 .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
					 .collect(Collectors.joining(" "));
	}
}
