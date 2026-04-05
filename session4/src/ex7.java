import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("mang khong hop le");
            return;
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int countUnique = 0;
        // tinh tan suat
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count == 1){
                result[countUnique] = arr[i];
                countUnique++;
            }
        }
        // In ket qua
        if (countUnique == 0) {
            System.out.println("Khong co phan tu nao duy nhat trong mang");
        } else {

            int[] finalArray = Arrays.copyOf(result, countUnique);

            System.out.println("Mang sau khi loai bo phan tu trung lap:");
            System.out.println(Arrays.toString(finalArray));
        }
    }
}
