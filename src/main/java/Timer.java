public class Timer {

    Sorter sort;

    public long calculateTime(Sorter sort, int[] A){
        long start = System.nanoTime();
        sort.sortArray(A);
        long finish = System.nanoTime();
        return finish - start;
    }

    public long compareTime(Sorter A, Sorter B, int[] array){
        long timeA = calculateTime(A,array);
        long timeB = calculateTime(B,array);
        return timeA - timeB;
    }

}
