package View;

import Misc.Timer;
import SortAlgorithms.Bubble;
import SortAlgorithms.Merge;
import SortAlgorithms.Sorter;
import SortAlgorithms.TreeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    public void con() {
        boolean carryon = true;
        Sorter sort;
        Sorter sort2;
        ArrayList<Integer> input = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please input the numbers you want");
        while (carryon) {
            System.out.println("please input value");
            int n = scanner.nextInt();
            input.add(n);
            System.out.println("do you want to add another value (y/n)");
            String x = scanner.next();
            if (x.equals("n")) {
                carryon = false;
            }
        }
        int[] inputarray = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            inputarray[i] = input.get(i);
        }
        System.out.println("The inputted array " + input);
        System.out.println("How do you want to sort the array?");
        System.out.println("SortAlgorithms.Bubble (b), SortAlgorithms.Merge (m), Tree sort (t)");
        String sorter = scanner.next();

        switch (sorter) {
            case "b":
                sort = new Bubble();
                break;
            case "m":
                sort = new Merge();
                break;
            case "t":
                sort = new TreeSort();
                break;
            default:
                sort = new Bubble();
        }
        Timer timer = new Timer();
        sort.sortArray(inputarray);
        System.out.println(Arrays.toString(inputarray));
        System.out.println("time taken for your sort was: "+ timer.calculateTime(sort,inputarray));
        System.out.println("do you wish to compare your sort to other sorting algorithms (y/n)");
        String q = scanner.next();

        if("y".equals(q)){
            System.out.println("what sorting algorithm do you want to compare with");
            System.out.println("merge (m), bubble(b) or SortAlgorithms.TreeSort(t)");
            String s = scanner.next();

            switch (s){
                case "m":
                    sort2 = new Merge();
                    break;
                case "b":
                    sort2 = new Bubble();
                    break;
                case "t":
                    sort2 = new TreeSort();
                    break;
                default:
                    sort2 = new Bubble();
            }
            System.out.println("the compare time is: "+ timer.compareTime(sort,sort2,inputarray));
        }
    }
}
