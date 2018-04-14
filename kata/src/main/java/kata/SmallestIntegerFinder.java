package kata;

import java.util.stream.IntStream;

/**
 * Created by NHNEnt on 2017-12-01.
 */
public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {

		//return IntStream.of(args).sorted().findFirst().getAsInt();
		return IntStream.of(args).min().getAsInt();
	}
}
