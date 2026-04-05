import java.util.Scanner;

public class ex10 {

    static int[] arr = new int[100];
    static int size = 0;

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Them phan tu");
            System.out.println("2. Xoa phan tu theo index");
            System.out.println("3. Hien thi mang");
            System.out.println("4. Sap xep giam dan");
            System.out.println("5. Tim kiem phan tu");
            System.out.println("6. Thoat");

            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addElement(sc);
                    break;

                case 2:
                    deleteElement(sc);
                    break;

                case 3:
                    displayArray();
                    break;

                case 4:
                    sortDesc();
                    break;

                case 5:
                    searchElement(sc);
                    break;

                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (choice != 6);
    }

    // 1. Them phan tu
    public static void addElement(Scanner sc) {
        System.out.print("Nhap so can them: ");
        int value = sc.nextInt();

        arr[size] = value;
        size++;

        System.out.println("Da them thanh cong");
    }

    // 2. Xoa phan tu theo index
    public static void deleteElement(Scanner sc) {

        if (size == 0) {
            System.out.println("Mang rong");
            return;
        }

        System.out.print("Nhap index can xoa: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Index khong hop le");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Da xoa phan tu");
    }

    // 3. Hien thi mang
    public static void displayArray() {

        if (size == 0) {
            System.out.println("Mang rong");
            return;
        }

        System.out.print("Mang: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // 4. Sap xep giam dan
    public static void sortDesc() {

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("Da sap xep giam dan");
    }

    // 5. Tim kiem
    public static void searchElement(Scanner sc) {

        if (size == 0) {
            System.out.println("Mang rong");
            return;
        }

        System.out.print("Nhap gia tri can tim: ");
        int value = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (arr[i] == value) {
                System.out.println("Tim thay tai index: " + i);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Khong tim thay");
        }
    }
}
