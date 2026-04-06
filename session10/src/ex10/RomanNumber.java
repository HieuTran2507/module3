package ex10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số (1-3999): ");
        int n = Integer.parseInt(sc.nextLine());

        if (n < 1 || n > 3999) {
            System.out.println("Chỉ nhập từ 1 đến 3999!");
            return;
        }

        // Map phải giữ thứ tự → dùng LinkedHashMap
        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (n >= entry.getKey()) {
                result.append(entry.getValue());
                n -= entry.getKey();
            }
        }

        System.out.println("Số La Mã: " + result);
    }
}
