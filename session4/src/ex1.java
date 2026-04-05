import java.util.Scanner;

public class ex1 {
    public static void selectionSortDesc(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int maxIndex = i;
            for(int j = i+1; j < n ; j++){
                if(arr[j] > arr[maxIndex]) maxIndex = j;
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // nhap kich thuoc mang
        System.out.print("nhap kich thuoc mang: ");
        int n = sc.nextInt();
        // tao mang
        int[] arr = new int[n];
        // nhap gia tri cho mang
        for(int i = 0; i<n; i++){
            System.out.print("nhap gia tri phan tu thu "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        // selection sort
        selectionSortDesc(arr);
        // in ket qua mang sau khi sap xep
        System.out.println("mang sau khi sap xep giam dan: ");
        for(int s : arr){
            System.out.print(s + " ");
        }
        // phan tu lon nhat
        int max = arr[0];
        System.out.print("\nphan tu lon nhat la: "+max);

    }

}
