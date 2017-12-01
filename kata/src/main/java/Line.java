import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by NHNEnt on 2017-11-30.
 */
public class Line {
	public static String Tickets(int[] peopleInLine) {
		for (int i : peopleInLine) {
			System.out.print(i + " ,");
		}

		System.out.println();
		int sum = 0;
		List<Integer> integerList = new ArrayList<>();


		Map<Integer, Integer> maps = new HashMap<>();
		for (int i : peopleInLine) {

		}


		for (int i : peopleInLine) {

			if (i > 25) {
				integerList.add(i);

			}

		}
		if (sum < 0) {
			return "NO";
		}
		return "YES";
	}
}
