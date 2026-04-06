package ex1_4;

public class ex1 {
    static void main(String[] args){
        // tao doi tuong rectangle voi constructor mac dinh
        Rectangle rec1 = new Rectangle();
        System.out.println("hcn 1: ");
        rec1.display();

        // tao doi tuong rectangle voi constructor co tham so
        Rectangle rec2 = new Rectangle(2, 5.5);
        System.out.println("hcn 2: ");
        rec2.display();
    }
}
