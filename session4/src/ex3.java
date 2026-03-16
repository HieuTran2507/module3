import java.util.Scanner;

public class ex3 {
    public static void bubbleSortDesc(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++ ){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap kich thuoc mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("nhap gia tri phan tu thu "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        bubbleSortDesc(arr);

        System.out.println("mang sau khi sap xep giam dan: ");
        for(int s : arr){
            System.out.print(s + " ");
        }
    }
}
