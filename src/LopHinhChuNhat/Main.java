package LopHinhChuNhat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.display();
    }
}
