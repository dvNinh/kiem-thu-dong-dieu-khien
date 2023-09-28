import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void phuongTrinhBacHai(double a, double b, double c) {
        if (a == 0) {
            if (b != 0) {
                System.out.println(-c / b);
            } else {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println(x1 + " " + x2);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            try {
                File file = new File("testcases/Test " + i + ".txt");
                Scanner reader = new Scanner(file);
                while (reader.hasNextDouble()) {
                    double a = reader.nextDouble();
                    double b = reader.nextDouble();
                    double c = reader.nextDouble();
                    System.out.println("Test " + i + ": Input: " + a + " " + b + " " + c);
                    System.out.print("\tOutput: ");
                    phuongTrinhBacHai(a, b, c);
                }     
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
