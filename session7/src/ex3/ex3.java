package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Person ng1 = new Person();
        Person ng2 = new Person();

        System.out.print("nhap ten nguoi 1: ");
        ng1.setName(sc.nextLine());
        System.out.print("nhap tuoi nguoi 1: ");
        ng1.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("nhap ten nguoi 2: ");
        ng2.setName(sc.nextLine());
        System.out.print("nhap tuoi nguoi 2: ");
        ng2.setAge(Integer.parseInt(sc.nextLine()));

        if(ng1.getAge() == ng2.getAge()) System.out.println(ng1.getName() + " bang tuoi " + ng2.getName());
        else if (ng1.getAge() < ng2.getAge()) System.out.println(ng1.getName() + " nho tuoi hon " + ng2.getName());
        else System.out.println(ng1.getName() + " lon tuoi hon " + ng2.getName());
    }
}
