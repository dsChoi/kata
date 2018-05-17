package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by NHNEnt on 2017-12-01.
 */
public class SpinWords {
	public String spinWords2(String sentence) {
		String[] split = sentence.split(" ");

		List<String> strings = new ArrayList<>();
		for (String word : split) {
			if (word.length() >= 5) {
				strings.add(new StringBuffer(word).reverse().toString());
				continue;
			}
			strings.add(word);
		}
		return strings.stream().collect(Collectors.joining(""));
	}

	public String spinWords(String sentence) {
		return
				Arrays.asList(sentence.split(" ")).stream().map(s -> {
					if (s.length() >= 5) {
						return s = new StringBuffer(s).reverse().toString();
					} else {
						return s;
					}
				}).collect(Collectors.joining(" "));
	}

}
