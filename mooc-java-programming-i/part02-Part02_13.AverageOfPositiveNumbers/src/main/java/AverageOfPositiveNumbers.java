
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numbers++;
                sum += number;
            }
        }
        
        double average = 1.0 * sum / numbers;
        
        if (numbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }

    }
}
