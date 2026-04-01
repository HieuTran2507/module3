package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1 {
    static void main(String[] args) {
        List<Integer> NumList = Arrays.asList(1,22,12,5,6,8,44);
        System.out.println("danh sách các số chẵn: ");
        NumList.forEach(num -> {
            if(num%2==0) System.out.println(num);
        });


        int sum = NumList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("tổng các số trong danh sách: " +sum);
    }
}
