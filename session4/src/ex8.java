import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuoc ma tran n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ma tran khong hop le");
            return;
        }

        int[][] matrix = new int[n][n];

        // Nhap ma tran
        System.out.println("Nhap cac phan tu ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Chuyen vi ma tran
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // Dao nguoc tung hang
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        // In ma tran ket qua
        System.out.println("Ma tran sau khi xoay 90 do:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
