package ex3;

public class ex3 {
    public static void main(String[] args){
        Circle circle = new Circle(12.3);
        Rectangle rectangle = new Rectangle(3,4);
        Square square = new Square(5);

        circle.setColor("red");
        rectangle.setColor("blue");
        square.setColor("green");

        System.out.println("tron: "+circle.getColor());
        System.out.println("hcn: "+rectangle.getColor());
        System.out.println("vuong: "+square.getColor());
    }

}
