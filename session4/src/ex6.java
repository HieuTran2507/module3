import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ex6 {
    public static void selectionSortDesc(int[] arr){
        int n = arr.length;
        for(int i=0; i<n ; i++){
            int maxIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[maxIndex]) maxIndex=j;
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static int linearSearch(int[] arr, int searchValue){
        int n = arr.length;
        int index;
        for (int i=0; i<n; i++) {
            if (arr[i] == searchValue) return i;
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int searchValue){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == searchValue) return mid;
            if(arr[mid] > searchValue) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){
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

        selectionSortDesc(arr);
        System.out.print("mang theo thu tu giam dan: ");
        System.out.print(Arrays.toString(arr));

        System.out.print("\nnhap so can tim: ");
        int num = sc.nextInt();

        int pp1 = linearSearch(arr,num);
        System.out.print("\nlinear search: "+arr[pp1]);
        int pp2 = binarySearchDesc(arr, num);
        System.out.print("\nbinary search: "+arr[pp2]);
    }
}
