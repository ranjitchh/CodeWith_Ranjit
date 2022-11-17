// program to print output in various ways in java

public class FormatOutput { // user defined class
    public static void main(String[] args) { // main function
        int x = 20;
        int y = 30;

        // simpy printing the value of variable
        System.out.println(x);

        // using string and value
        System.out.println("the given number is " + x);

        // printing both the value of variable
        System.out.println("the given two numbers are " + x + y);

        // printing the addition of two numbers
        System.out.println("the sum of two numbers are=" + (x + y));

        // printing using print(it doesn't give the nextline) method
        System.out.print(x + y);
         
    }
}
