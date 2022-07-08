import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Merge implements Sorter {
    public static Logger logger = LogManager.getLogger("My Logger");

    @Override
    public int[] sortArray(int[] arrayToSort) {

        int left = 0;
        int right = arrayToSort.length - 1;
        return sort(arrayToSort,left,right);
    }


    public int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(array, left, mid);
            sort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
        return array;
    }

    public void merge(int[] arrayToMerge, int left, int mid, int right) {

        try {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for (int i = 0; i < n1; i++) {
                leftArray[i] = arrayToMerge[left + i];
            }
            for (int i = 0; i < n2; i++) {
                rightArray[i] = arrayToMerge[mid + 1 + i];
            }
            int i = 0, j = 0;
            int k = left;

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arrayToMerge[k] = leftArray[i];
                    i++;
                } else {
                    arrayToMerge[k] = rightArray[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                arrayToMerge[k] = leftArray[i];
                i++;
                k++;
            }
            while (j < n2) {
                arrayToMerge[k] = rightArray[j];
                j++;
                k++;

            }
        } catch (Exception e) {
            logger.error("You have got the error ", e);
        }
    }
}





