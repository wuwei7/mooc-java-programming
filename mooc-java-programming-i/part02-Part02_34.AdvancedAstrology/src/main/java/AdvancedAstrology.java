
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int spaces = size;
        int stars = 1;
        while (spaces > 0) {
            printSpaces(spaces - 1);
            printStars(stars);    
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        int stars = 1;
        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars += 2;
        }
        
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
