package ex3;

import java.util.Scanner;

public class inputData {
    public static String getString(Scanner sc, String suggest){
        String input;
        do {
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) System.out.println("vui lòng không để trống");
        } while (input.isEmpty());
        return input;
    }


}

