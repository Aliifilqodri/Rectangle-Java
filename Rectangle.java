import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input panjang dan lebar dari pengguna
        System.out.print("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();

        // Menghitung luas dan keliling
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Menampilkan hasil
        System.out.println("Luas persegi panjang: " + area);
        System.out.println("Keliling persegi panjang: " + perimeter);

        scanner.close();
    }
}
