package ex3;

import java.util.Scanner;

public class Categories implements IShop {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Categories() {}

    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    // Getter/Setter
    public int getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    // input
    public void inputData(Scanner scanner, Categories[] arr, int index) {
        // auto tăng ID
        if (index == 0) {
            this.catalogId = 1;
        } else {
            this.catalogId = arr[index - 1].catalogId + 1;
        }

        // name không trùng
        while (true) {
            System.out.print("Tên danh mục: ");
            String name = scanner.nextLine();
            if (name.length() <= 50 && !isExistName(name, arr, index)) {
                this.catalogName = name;
                break;
            }
            System.out.println("Tên bị trùng hoặc >50 ký tự!");
        }

        System.out.print("Mô tả: ");
        this.descriptions = scanner.nextLine();

        // status
        while (true) {
            System.out.print("Trạng thái (true/false): ");
            String status = scanner.nextLine();
            if (status.equals("true") || status.equals("false")) {
                this.catalogStatus = Boolean.parseBoolean(status);
                break;
            }
            System.out.println("Chỉ nhập true/false!");
        }
    }

    private boolean isExistName(String name, Categories[] arr, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i].catalogName.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayData() {
        System.out.printf("ID:%d | Name:%s | Desc:%s | Status:%s\n",
                catalogId, catalogName, descriptions, catalogStatus ? "Hoạt động" : "Không hoạt động");
    }
}
