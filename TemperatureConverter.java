import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a Temperature Converter App");

        boolean continueConverting = true;

        while (continueConverting) {
            System.out.println("Choose an option");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");

            int choice = 0;

            while (true){
                System.out.println("Enter 1 or 2: ");
                if (scanner.hasNextInt()){
                    choice = scanner.nextInt();
                    if (choice == 1 || choice == 2) {
                        String conversionType = (choice == 1)
                        ? "Celsius to Fahrenheit"
                        : "Fahrenheit to Celsius";
                        System.out.println("You selected: " + conversionType);
                        break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter 1 or 2");
        }
        double temperature = 0;
        System.out.println("Enter the temperature value: ");
        while(true){
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input.Please enter a valid number.");
                scanner.next();
            }
        }

        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit", temperature, convertedTemperature);
        } else{
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is eqaul to %.2f Celsius", temperature, convertedTemperature);
        } 

        System.out.println("Would you like to continue converting temperatures? (yes/no)");
        String response = scanner.next().toLowerCase();
        if (!response.equals("yes") && !response.equals("y")){
            continueConverting = false;
            System.out.println("\nThank you for using the Temperature Converter App");
        }


   
}
scanner.close();
}
} 
