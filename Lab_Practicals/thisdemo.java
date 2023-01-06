import java.io.*;
public class thisdemo {
   int i,j;
   thisdemo()
   {
    this(100);

   }
   thisdemo(int a)
   {
    this(a,200);

   }
   thisdemo(int i,int j)
   {
    this.i=i;
    this.j=j;

   }
   void display()
    {
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
    public static void main(String[] args) throws IOException {
      thisdemo t1=new thisdemo();
      t1.display();
    }
}
