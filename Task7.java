import java.util.Scanner;
public class Task7 {
     
    public static double addition(double num1, double num2) {
        return num1 + num2; }

    public static double subtraction (double num1, double num2) {
        return num1 - num2; }
    
        public static double multiplication (double num1, double num2) {
        return num1 * num2; }

    public static double division (double num1, double num2) {
       if (num2 == 0) {
           System.out.println("Cannot divide by 0");
            return Double.NaN;
       }
       return num1 / num2;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter 1st #: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd #: ");
        double num2 = scanner.nextDouble();

        double plus = addition (num1, num2);
        double minus = subtraction (num1, num2);
        double times = multiplication (num1, num2);
        double divide = division (num1, num2);

        System.out.println("\n===ANSWER===");
        System.out.println(num1 +" + " +num2 + " = "+ plus + " (ADDITION)");
        System.out.println(num1 +" - " +num2 + " = "+ minus + " (SUBTRACTION)");
        System.out.println(num1 +" * " +num2 + " = "+ times + " (MULTIPLICATION)");
        System.out.println(num1 +" / " +num2 + " = "+ divide+ " (DIVISION)");

        scanner.close();
    }
}
