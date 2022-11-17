import java.lang.*; 
import java.io.*;  
class IoInJava {
        public static void main(String arg[]) throws IOException 
        {
            DataInputStream sc=new DataInputStream(System.in);
            
            System.out.println("enter the value");
            int a;
            a=Integer.parseInt(sc.readLine());
            
            System.out.println("enter  the name");
            String name;
            name=sc.readLine();
            
            System.out.println(a);
            System.out.println(name);
        }
}
