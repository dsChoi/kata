package hackerrank;

public class AngryProfessor {

    static String YES = "YES";
    static String NO = "NO";
    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int arrivedCount = 0;
        for (int i : a) {
            if(i <=0){
                arrivedCount++;
            }
        }
        return k <= arrivedCount ? NO : YES;
    }
}
