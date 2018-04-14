package kata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by NHNEnt on 2017-11-30.
 */
public class AreSame {
	public static boolean comp2(int[] a, int[] b) {

		if (a == null || b == null) {
			return false;
		}

		Set<Integer> aCollect = Arrays.stream(a).boxed().collect(Collectors.toSet());
		Set<Integer> bCollect = Arrays.stream(b).boxed().collect(Collectors.toSet());

		System.out.println(" a  = ");
		aCollect.forEach(integer -> System.out.print(integer + ", "));
		System.out.println("\n b  = ");
		bCollect.forEach(integer -> System.out.print(integer + ", "));

		return aCollect.stream().allMatch(integer -> {
											  int pow = (int) Math.pow(integer, 2);
											  boolean has = bCollect.contains(pow);
											  if (has) {
												  bCollect.remove(pow);
											  }
											  return has;
										  }
										 );

	}

	public static boolean comp(int[] a, int[] b) {

		if (a == null || b == null) {
			return false;
		}

		Set<Integer> aCollect = new HashSet<>();
		Set<Integer> bCollect = Arrays.stream(b).boxed().collect(Collectors.toSet());
		for (int i : a) {
			aCollect.add(Math.abs(i));
		}

		System.out.println(" a  = ");
		aCollect.forEach(integer -> System.out.print(integer + ", "));

		System.out.println("\n b  = ");
		bCollect.forEach(integer -> System.out.print(integer + ", "));

		boolean result = bCollect.stream().allMatch(integer -> {
														int sqrt = (int) Math.sqrt(integer);
														boolean has = aCollect.contains(sqrt);
														if (has) {
															aCollect.remove(sqrt);
														}
														return has;
													}
												   );
		return result;

	}
}
