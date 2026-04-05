import java.util.Scanner;

public class ex4 {
    public static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap kich thuoc mang: ");
        int n = sc.nextInt();

        if(n<= 0) System.out.println("mang rong");
        else{
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                System.out.print("nhap gia tri phan tu thu "+(i+1)+": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("mang truoc khi dao: ");
            for(int s : arr){
                System.out.print(s + " ");
            }

            reverseArr(arr);
            System.out.println("\nmang sau khi dao: ");
            for(int s : arr){
                System.out.print(s + " ");
            }
        }
    }
}
