import java.io.*;

public class AreaGeometric {
    public static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double triArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double rectArea(double width, double height) {
        return width * height;
    }

    public static String readLine() {
        String input = " ";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            input = br.readLine();

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("enter the radius");
        Double radius = Double.parseDouble(readLine());
        System.out.println("Area of circle= " + circleArea(radius));

        
        System.out.println("enter the side");
        Double side = Double.parseDouble(readLine());
        System.out.println("area of square " + squareArea(side));

        
        System.out.println("enter the width");
        Double width = Double.parseDouble(readLine());
        System.out.println("enter the height");
        Double height = Double.parseDouble(readLine());
        System.out.println("area of rectangle" + rectArea(width, height));


        System.out.println("enter the base");
        Double base = Double.parseDouble(readLine());
        System.out.println("enter the height");
        Double height1 = Double.parseDouble(readLine());
        System.out.println("area of triangle" + triArea(base, height1));
    }
}
