import java.util.Scanner;

public class ex8 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String input = sc.nextLine();

        if(input.length()==0){
            System.out.println();
            return;
        }

        // dem ky tu trung va gan so
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i=1; i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)) count++;
            else {
                result.append(input.charAt(i-1));
                result.append(count);
                count = 1;
            }
        }
        // them ky tu cuoi cung
        result.append(input.charAt(input.length()-1));
        result.append(count);
        System.out.println("chuoi sau khi nen: "+ result);
    }
}
