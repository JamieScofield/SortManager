import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    public void con() {
        boolean carryon = true;
        Sorter sort;
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
        System.out.println("Bubble (b), Merge (m)");
        String sorter = scanner.next();

        switch (sorter) {
            case "b":
                sort = new Bubble();
                break;
            case "m":
                sort = new Merge();
                break;
            default:
                sort = new Bubble();
        }
        sort.sortArray(inputarray);
        System.out.println(Arrays.toString(inputarray));

    }
}
