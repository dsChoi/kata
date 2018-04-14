package kata;

import java.util.stream.IntStream;

/**
 * Created by 두석 on 2017-12-01.
 */
public class Sum {
    public int GetSum(int a, int b) {
        if( a > b){
            return IntStream.rangeClosed(b, a).sum();
        }else{
            return IntStream.rangeClosed(a,b).sum();
        }
    }
}
