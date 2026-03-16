import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mang khong hop le");
            return;
        }

        int[] arr = new int[n];

        // Nhap mang
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        1. Duyệt từng phần tử trong mảng
//        2. Cộng phần tử đó vào currentSum
//        3. Nếu currentSum > maxSum → cập nhật maxSum
//        4. Nếu currentSum < 0 → reset currentSum = 0
        int maxSum = arr[0];
        int currentSum = 0;

        for (int i = 0; i < n; i++) {

            currentSum = currentSum + arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Tong lon nhat cua day con lien tiep: " + maxSum);
    }
}
