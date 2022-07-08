package SortAlgorithms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bubble implements Sorter {
    public static Logger logger = LogManager.getLogger("My Logger");
    public int[] sortArray(int[] A) {
        try {
        if(A.length == 0){
            System.out.println("please enter a valid array");
        } else {

            int n = A.length;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (A[j] < A[j - 1]) {
                        int holder = A[j - 1];
                        A[j - 1] = A[j];
                        A[j] = holder;
                    }
                }
            }
        }
        } catch (Exception e){
            logger.error("You have got the error ", e);
        }

        return A;
    }
}
