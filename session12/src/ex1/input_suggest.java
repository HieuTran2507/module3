package ex1;

import java.util.Scanner;

public class input_suggest {
    public static String getString(Scanner sc, String suggest){
        String input = "";
        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) System.out.println("Vui lòng không để trống");
            else return input;
        }
    }

    public static Integer getInt(Scanner sc, String suggest){
        String input = "";
        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) {
                System.out.println("Vui lòng không để trống");
                continue;
            }
            try {
                Integer numInt = Integer.parseInt(input);
                if(numInt < 0) System.out.println("Vui lòng nhập số >= 0");
                else return numInt;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số nguyên");
            }
        }
    }

    public static Double getDouble(Scanner sc, String suggest){
        String input = "";
        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) {
                System.out.println("Vui lòng không để trống");
                continue;
            }
            try {
                Double numDouble = Double.parseDouble(input);
                if (numDouble<0) System.out.println("vui lòng nhập số >= 0");
                else return numDouble;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số thực");
            }
        }
    }
}
