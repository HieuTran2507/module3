package ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Students[] studentArray = new Students[5];

        studentArray[0] = new Students("Alice", 20, "A1", 8.5);
        studentArray[1] = new Students("Bob", 21, "A1", 7.0);
        studentArray[2] = new Students("Charlie", 19, "A2", 9.0);
        studentArray[3] = new Students("David", 22, "A2", 6.5);
        studentArray[4] = new Students("Eve", 20, "A1", 8.0);

        System.out.print("nhap diem min: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print("nhap diem max: ");
        double max = Double.parseDouble(sc.nextLine());

        for(Students s : studentArray){
            if(s.getAvgScore()>=min && s.getAvgScore()<=max){
                System.out.println(s.getName());

            }
        }

    }
}
