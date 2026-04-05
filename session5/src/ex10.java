import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex10 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap van ban: ");
        String text = sc.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("Khong co van ban de xu ly.");
            return;
        }

        // Lưu chuỗi gốc để trích xuất số
        String originalText = text;

        // 1. Xóa ký tự đặc biệt và số
        text = text.replaceAll("[^a-zA-Z ]", "");

        // 2. Chuẩn hóa văn bản
        text = text.toLowerCase();
        text = text.trim().replaceAll("\\s+", " ");

        // 3. In văn bản chuẩn hóa
        System.out.println("Van ban da chuan hoa: " + text);

        // 4. Trích xuất số từ chuỗi ban đầu
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(originalText);

        System.out.print("Danh sach cac so: ");

        boolean found = false;

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        if (!found) {
            System.out.print("Khong co so nao");
        }
    }
}