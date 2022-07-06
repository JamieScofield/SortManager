import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merger {

    public int[] merge(int[] arrayA, int[] arrayB){
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        for(int i:arrayA){
            listA.add(i);
        }
        for(int i:arrayB){
            listB.add(i);
        }

        ArrayList<Integer> listTotal = new ArrayList<Integer>();
        listTotal.addAll(listA);
        listTotal.addAll(listB);


        int[] newArray = new int[listTotal.size()];
        for(int i = 0; i< listTotal.size();i++){
            newArray[i] = listTotal.get(i);
        }
        return newArray;
    }
}
