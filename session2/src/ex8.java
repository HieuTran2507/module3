import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap vao so 100~999: ");
        int n = sc.nextInt();
        if (n<100 || n>999) {
           System.out.print("so nhap vao khong hop le");
           return;
        }
        int hundreds = n/100;
        int tens = (n%100)/10;
        int units = n%10;

        // hundreds
        switch (hundreds) {
            case 1: System.out.print("Mot tram "); break;
            case 2: System.out.print("Hai tram "); break;
            case 3: System.out.print("Ba tram "); break;
            case 4: System.out.print("Bon tram "); break;
            case 5: System.out.print("Nam tram "); break;
            case 6: System.out.print("Sau tram "); break;
            case 7: System.out.print("Bay tram "); break;
            case 8: System.out.print("Tam tram "); break;
            case 9: System.out.print("Chin tram "); break;
        }

        // tens
        switch (tens) {
            case 0: break;
            case 1: System.out.print("muoi "); break;
            case 2: System.out.print("hai muoi "); break;
            case 3: System.out.print("ba muoi "); break;
            case 4: System.out.print("bon muoi "); break;
            case 5: System.out.print("nam muoi "); break;
            case 6: System.out.print("sau muoi "); break;
            case 7: System.out.print("bay muoi "); break;
            case 8: System.out.print("tam muoi "); break;
            case 9: System.out.print("chin muoi "); break;
        }

        // units
        switch (units) {
            case 0: break;
            case 1: System.out.print("mot"); break;
            case 2: System.out.print("hai"); break;
            case 3: System.out.print("ba"); break;
            case 4: System.out.print("bon"); break;
            case 5: System.out.print("nam"); break;
            case 6: System.out.print("sau"); break;
            case 7: System.out.print("bay"); break;
            case 8: System.out.print("tam"); break;
            case 9: System.out.print("chin"); break;
        }
    }
}
