import Misc.Merger;
import SortAlgorithms.Bubble;
import SortAlgorithms.Merge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testing {

    @Test
    @DisplayName("SortAlgorithms.Bubble Test")
    void bubbleTest(){
        Bubble bubble = new Bubble();
        int[] start = {5,4,3,2,1};
        int[] result = {1,2,3,4,5};
        Assertions.assertArrayEquals(result,bubble.sortArray(start));
    }


    @Test
    @DisplayName("Test merging arrays")
    void mergeArrays(){
        Merger merger = new Merger();
        int[] arrayA = {1,2,3,4};
        int[] arrayB = {5,6,7,8};
        int[] arraySum = {1,2,3,4,5,6,7,8};
        Assertions.assertArrayEquals(arraySum,merger.merge(arrayA,arrayB));
    }

    @Test
    @DisplayName("SortAlgorithms.Merge Test")
    void mergeTest(){
        Merge merge = new Merge();
        int[] start = {5,4,3,2,1};
        int[] result = {1,2,3,4,5};
        Assertions.assertArrayEquals(result,merge.sortArray(start));
    }





}
