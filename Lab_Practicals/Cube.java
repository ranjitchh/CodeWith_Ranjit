public class Cube{
    int length, breadth, height;

    public int getVolume() {
        return (length * breadth * height);
    }

    Cube()
    {
     length=breadth=height=2;
     System.out.println("initialize with default constructor");

    }
    Cube(int l, int b)
    {
        length=l;
        breadth=b;
        height=2;
        System.out.println("initiliazed with parametrized constructor having 2 parameters ");

    }
Cube(int l,int b, int h){
    length=l;
    breadth=b;
    height=h;
    System.out.println("initialized with parametrized constructor having three parameters");
}
public static void main(String[] args) {
    Cube c1=new Cube();
    System.out.println("volume of cube1 is :"+c1.getVolume());
    Cube c2=new Cube(10,20);
    System.out.println("voulme of cube2 is "+ c2.getVolume());
    Cube c3=new Cube(10,20,30);
    System.out.println("volume of cube 3 is "+ c3.getVolume());
}
}
