package QuadraticEquation;
import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta > 0){
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println(quadraticEquation.getRoot1());
        }else{
            System.out.println("Vo nghiem");
        }
    }
}
