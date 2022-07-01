import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean carryon = true;
        ArrayList<Integer> input = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please input the numbers you want");
        while(carryon){
            System.out.println("please input value");
            int n = scanner.nextInt();
            input.add(n);
            System.out.println("do you want to add another value (y/n)");
            String x = scanner.next();
            if(x.equals("n")){
                carryon = false;
            }
        }
        int [] inputarray = new int[input.size()];
        for(int i = 0; i < input.size();i++){
            inputarray[i] = input.get(i);
        }

        System.out.println("The inputted array "+ input);

    }
}
