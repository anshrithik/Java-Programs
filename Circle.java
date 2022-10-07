import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        r = sc.nextDouble();
        System.out.println("Area : "+(3.14*r*r));
        System.out.println("Circumference : "+(2*3.14*r));
    }
}
