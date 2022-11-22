import java.util.Scanner;

public class StudMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name, regno;
        int m1, m2, m3, m4, m5, total, avg;

        System.out.println("enter your name?");
        name = sc.nextLine();

        System.out.println("enter your regno?");
        regno = sc.nextLine();

        System.out.println("enter the marks 1");
        m1 = sc.nextInt();

        System.out.println("enter the marks 2");
        m2 = sc.nextInt();

        System.out.println("enter the marks 3");
        m3 = sc.nextInt();

        System.out.println("enter the marks 4");
        m4 = sc.nextInt();

        System.out.println("enter the marks 5");
        m5 = sc.nextInt();

        total = (m1 + m2 + m3 + m4 + m5);
        avg = total / 5;
        System.out.println(name +" You got Total marks "+total);
       
        if(avg>90)
        {
            System.out.println("you got Grade A");
        }
     else if(avg<90 && avg>60)
        {
         System.out.println("you got Grade B");  
        }
        else if(avg>40 && avg<60)
        {
            System.out.println("you got Grade C");
        }
        else if(avg==40){
          System.out.println("you just passed !");         
         }   
         else{
            System.out.println("you got Failed ! Better luck next time");
         }
     
        }
}
