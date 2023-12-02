
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int numbersTotal = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            
            sum += number;
            numbersTotal++;
        }
        
        double average = 1.0 * sum / numbersTotal;
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersTotal);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);

    }
}
