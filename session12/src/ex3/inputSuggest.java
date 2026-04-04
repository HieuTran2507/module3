package ex3;

import java.util.Scanner;

public class inputSuggest {
    public static String getString(Scanner sc, String suggesst){
        String input = "";
        while (true){
            System.out.print(suggesst);
            input = sc.nextLine();
            if (input.isEmpty()) System.out.println("vui lòng không để trống");
            else return input;
        }
    }

    public static Integer getInt(Scanner sc, String suggesst){
        String input = "";
        while (true){
            System.out.print(suggesst);
            input = sc.nextLine();
            if(input.isEmpty()) {
                System.out.println("vui lòng không để trống");
                continue;
            }
            try {
                return Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập định dạng số nguyên");
            }
        }
    }


    public static Float getFloat(Scanner sc, String suggesst){
        String input = "";
        while (true){
            System.out.print(suggesst);
            input = sc.nextLine();
            if(input.isEmpty()) {
                System.out.println("vui lòng không để trống");
                continue;
            }
            try {
                Float num = Float.parseFloat(input);
                if (num <= 0) System.out.println("vui lòng nhập số thực > 0");
                else return num;
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập định dạng số thực");
            }
        }
    }
}
