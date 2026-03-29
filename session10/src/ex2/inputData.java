package ex2;

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

    public static Integer getInt(Scanner sc, String suggest){
        String input;
        do {
            System.out.print(suggest);
            input = sc.nextLine();
            try {
                if(input.isEmpty()) System.out.println("vui lòng không để trống");
                else if(Integer.parseInt(input) < 0) System.out.println("vui lòng nhập sô nguyên lớn hơn 0");
                else break;
            }
            catch (Exception e) {System.out.println("vui lòng nhập sô nguyên lớn hơn 0");}
        } while (true);
        return Integer.parseInt(input);
    }
}
