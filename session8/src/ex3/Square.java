package ex3;

public class Square implements Colorable {
    private final double size;
    private String color;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
