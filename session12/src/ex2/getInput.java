package ex2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class getInput {

    public static String getString(Scanner sc, String suggest){
        String input = "";
        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) System.out.println("vui lòng không để trống");
            else return input;
        }
    }

    public static Integer getInt(Scanner sc, String suggest){
        String input = "";
        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) {
                System.out.println("vui lòng không để trống");
                continue;
            }
            try {
                return Integer.parseInt(input);
            }catch (NumberFormatException e) {
                System.out.println("vui lòng nhập định dạng số");
            }
        }
    }

    public static LocalDate getDate(Scanner sc, String suggest){
        String input = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) {
                System.out.println("vui lòng không để trống");
                continue;
            }
            try {
                return LocalDate.parse(input,formatter);
            }catch (DateTimeException e){
                System.out.println("vui lòng nhập đúng định dạng dd/mm/yyyy");
            }
        }
    }
}
