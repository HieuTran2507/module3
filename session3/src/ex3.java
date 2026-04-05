import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalEmpoyees = 0;
        double totalSalaries = 0;
        double salary = 0;
        double max = 0;
        double min = 500;
        ArrayList<Double> salaries = new ArrayList<>();
        do{
            System.out.println("***************MENU NHẬP LƯƠNG***************");
            System.out.println("1.  Nhập lương nhân viên");
            System.out.println("2.  Hiển thị thống kê");
            System.out.println("3.  Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4.  Thoát");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.println("nhap luong nhan vien, neu muon ket thuc thi nhap -1");
                    while (true){
                        System.out.println("nhap luong nhan vien");
                        salary = Double.parseDouble(sc.nextLine());
                        if (salary == -1) break;
                        if(salary < 0 || salary > 500){
                            System.out.println("nhap luong tu 0 - 500");
                            continue;
                        }

                        if(salary < 5) System.out.println("thu nhap thap");
                        else if (salary < 15) System.out.println("thu nhap trung binh");
                        else if (salary < 50) System.out.println("thu nhap kha");
                        else System.out.println("thu nhap cao");

                        // thong ke
                        totalEmpoyees++;
                        totalSalaries += salary;
                        salaries.add(salary);
                        if(salary>max) max = salary;
                        if(salary<min) min = salary;
                    }
                    break;
                case 2:
                    if(totalEmpoyees == 0) System.out.println("chua co du lieu");
                    else{
                        System.out.println("so luong nhan vien da nhap: "+totalEmpoyees);
                        System.out.println("luong trung binh: "+(totalSalaries/totalEmpoyees));
                        System.out.println("luong cao nhat: "+max);
                        System.out.println("luong thao nhat: "+min);
                        System.out.println("tong tien luong: "+totalSalaries);
                    }
                    break;
                case 3:
                    if(salaries.size() == 0) System.out.println("chua co du lieu");
                    else {
                        double totalBonus = 0;
                        for (double s : salaries) {
                            if (s < 5) totalBonus += s * 0.05;
                            else if (s < 15) totalBonus += s * 0.1;
                            else if (s < 20) totalBonus += s * 0.15;
                            else if (s < 50) totalBonus += s * 0.2;
                            else if (s < 100) totalBonus += s * 0.25;
                        }
                        System.out.println("tong tien thuong: " + totalBonus);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("vui long nhap tu 1 - 4");
            }
        }
        while (true);
    }
}
