package ex5;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inputData {
    public static String getString(Scanner sc, String suggest){
        String input = "";

        while (true){
            System.out.print(suggest);
            input = sc.nextLine();
            if(input.isEmpty()) System.out.println("vui lòng không để trống");
            else return input;
        }
    }

    public static LocalDateTime getDateTime(Scanner sc, String suggest){
        String input = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        while (true){
            System.out.print(suggest);
            input = sc.nextLine();

            if (input.isEmpty()){
                System.out.println("vui lòng không để trống");
                continue;
            }
            try {
                return LocalDateTime.parse(input,formatter);
            }catch (DateTimeException e){
                System.out.println("vui lòng nhập đúng định dang yyyy/MM/dd HH:mm: ");
            }
        }
    }



}
