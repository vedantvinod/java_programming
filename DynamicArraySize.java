import java.util.Scanner;

public class DynamicArraySize {
    public static void main(String[] args) {
        // 1. Get the desired size from a dynamic source (e.g., user input)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired array size: ");
        int arraySize = scanner.nextInt(); // Size is determined at runtime

        // 2. Use the variable to instantiate the array
        // The array is created with the size specified by the 'arraySize' variable.
        int numbers []= new int[arraySize]; 
        
        System.out.println("Array of size " + numbers.length + " created successfully.");
        
        // Example use: Populate the array
        System.out.println("entar the elements");
        for (int i = 0; i < numbers.length; i++) {
            
             numbers[i]= scanner.nextInt();
        }

        scanner.close();
    }
}