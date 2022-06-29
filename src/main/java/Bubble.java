public class Bubble implements Sorter{
    public int[] sortArray(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++){
                if (A[j]<A[j-1]){
                    int holder = A[j-1];
                    A[j-1] = A[j];
                    A[j] = holder;
                }
            }
        }
        return A;
    }
}
