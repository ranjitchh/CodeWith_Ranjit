public class Factorial {
    public static void main(String[] args) {
        int arr[] = new int[10]; // creating array of size 10 
        int fact;
        if (args.length == 0) {                // condition to check if there is any argument or not 
            System.out.println("no argument is present");
            return;
        }
        for (int i = 0; i < args.length; i++) {      // to take input from argument to arrays
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++) {         // finding the factorial of a given number
            fact = 1;
            while (arr[i] > 0) {
                fact = fact * arr[i];
                arr[i]--;
            }
            System.out.println("factorial of" + args[i] + "is" + fact);
        }
    }
} 
output: check the folder Lab_Practical Output
