//IamMradul
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an array index (0 to 4): ");
        int index = scanner.nextInt();
        
        try {
            System.out.println("Element at index " + index + " is: " + num[index]);
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
        }
        
        finally {
            System.out.println("Array access operation has concluded.");
            scanner.close();
        }
    }
}
