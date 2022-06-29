import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testing {

    @Test
    @DisplayName("Bubble Test")
    void bubbleTest(){
        Bubble bubble = new Bubble();
        int[] start = {5,4,3,2,1};
        int[] result = {1,2,3,4,5};
        Assertions.assertArrayEquals(result,bubble.sortArray(start));
    }
}
