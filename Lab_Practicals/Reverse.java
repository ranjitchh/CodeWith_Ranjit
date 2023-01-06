import java.io.*;
public class Reverse {
    public static void main(String[] args) throws IOException {
        int rev=0,num,digits;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number to reverse");
        num=Integer.parseInt(br.readLine());
        while(num>0)
        {
          digits=num%10;
          num=num/10;
          rev=rev*10+digits;

        }
        System.out.println("the reverse of the number is:"+rev);
        
    }
}
