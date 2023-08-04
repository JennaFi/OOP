package hw_1;

public class Task_2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.5, 7.8);
        System.out.println("The perimeter is: " + rectangle.calculatePerimeter());
        System.out.println("The square is: " + rectangle.calculateArea());

    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double calculateArea () {
        return (getWidth() * getHeight());

    }

    double calculatePerimeter() {
        return ((getWidth() + getHeight()) * 2);
    }
}
