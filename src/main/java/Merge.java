public class Merge implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int left = arrayToSort[0];
        int right = arrayToSort[arrayToSort.length-1];
        if(left < right){
            int mid = left+right/2;
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] l = new int[n1];
            int[] r = new int[n2];

            sortArray(l);
            sortArray(r);

            merge(arrayToSort);

        }
        return arrayToSort;

    }

    public void merge(int[] arrayToMerge){

        int left = arrayToMerge[0];
        int right = arrayToMerge[arrayToMerge.length-1];
        int mid = left+right/2;

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0; i < n1; i++){
            leftArray[i] = arrayToMerge[left + i];
        }
        for(int i=0; i < n2; i++){
            rightArray[i] = arrayToMerge[mid + 1 ];
        }
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arrayToMerge[k] = leftArray[i];
                i++;
            }
            else{
                arrayToMerge[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arrayToMerge[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2){
            arrayToMerge[k] = rightArray[j];
            j++;
            k++;

        }
    }





/*
    public void mergeSort(int[] arrayToSort){
        int left = arrayToSort[0];
        int right = arrayToSort[arrayToSort.length-1];
        int mid = left+right/2;

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int l[] = new int[n1];
        int r[] = new int[n2];

        for (int i = 0; i < n1; i++){
            l[i] = arrayToSort[1+i];
        }
        for (int i = 0; i < n2; i++){
            r[i] = arrayToSort[mid + 1 + i];
        }
    } */

}
