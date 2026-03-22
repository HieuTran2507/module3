package ex1;

public class Rectangle {
    // thuoc tinh
    private double length, width;

    // phuong thuc khong tham so
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // phuong thuc co tham so
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // phuong thuc tinh dien tich
    public double getArea(){
        return(length*width);
    }

    // phuong thuc tinh chu vi
    public double getPerimiter(){
        return 2*(length+width);
    }
    // phuong thuc hien thi
    public void display(){
        System.out.println("chieu dai: "+length);
        System.out.println("chieu rong: "+width);
        System.out.println("dien tich: "+getArea());
        System.out.println("chu vi: "+getPerimiter());
    }
}
