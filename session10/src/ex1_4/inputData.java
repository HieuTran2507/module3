package ex1_4;

import java.util.Scanner;

public class inputData {
    public static String getString(Scanner sc, String suggest){
        String input = "";
        do {
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) System.out.println("Vui lòng ko để trống !");
        }
        while (input.isEmpty());
        return input;
    }

    public static Integer getInt(Scanner sc, String suggest){
        String input;
        do {
            System.out.print(suggest);
            input = sc.nextLine();
            try{
                if(input.isEmpty()) System.out.println("Vui lòng ko để trống !");
                else if (Integer.parseInt(input) < 0) System.out.println("vui lòng nhập số nguyên >= 0");
                else break;
            }
            catch (Exception e){
                System.out.println("vui lòng nhap số nguyên >= 0");
            }
        }
        while (true);
        return Integer.parseInt(input);
    }

    public static Double getDou(Scanner sc, String suggest){
        String input;
        do {
            System.out.print(suggest);
            input = sc.nextLine();
            try{
                if(input.isEmpty()) System.out.println("Vui lòng ko để trống !");
                else if (Double.parseDouble(input) < 0) System.out.println("vui lòng nhap số >= 0");
                else break;
            }
            catch (Exception e){
                System.out.println("vui lòng nhap số >= 0");
            }
        }
        while (true);
        return Double.parseDouble(input);
    }

}
