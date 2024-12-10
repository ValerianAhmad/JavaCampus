import java.util.Scanner;

public class Calculator {
    public static int calculatorEventSum(int maxNumber) {
        int sum = 0;
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka maksimal: ");
        int maxNumber = scanner.nextInt();

        int result = calculatorEventSum(maxNumber);

        System.out.println("Jumlah angka genap dari 1 sampai " + maxNumber + " adalah: " + result);

        scanner.close();
    }
}
