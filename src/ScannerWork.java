import java.util.Scanner;

public class ScannerWork {
    static double radius_of_circle(double R) {
        Double length_circle = 2 * Math.PI * R;
        return length_circle;
    }

    static double square_of_circle(double R) {
        Double square_circle = Math.PI * Math.pow(R, 2);
        return square_circle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write radius: ");

        if(scanner.hasNextDouble()) {
            Double r = scanner.nextDouble();

            Double length = radius_of_circle(r);
            Double square = square_of_circle(r);

            System.out.println("Length: " + length);
            System.out.println("Square: " + square);
        } else if(scanner.hasNextInt()) {
            Integer r = scanner.nextInt();
            Double rad = r.doubleValue();

            Double length = radius_of_circle(rad);
            Double square = square_of_circle(rad);

            System.out.println("Length: " + length);
            System.out.println("Square: " + square);
        } else {
            System.out.println("Unsupported type");
        }
    }
}
