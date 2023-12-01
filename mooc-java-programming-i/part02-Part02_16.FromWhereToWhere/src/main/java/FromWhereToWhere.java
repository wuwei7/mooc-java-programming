
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int toNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int fromNumber = Integer.valueOf(scanner.nextLine());
        
        int i = fromNumber;
        while (i <= toNumber) {
            System.out.println(i);
            i++;
        }
        
    }
}
