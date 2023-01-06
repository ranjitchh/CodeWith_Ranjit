import java.io.*;

public class SumOfDigit {
 public static void main(String[] args) throws IOException{
    int r=0,sum=0,num;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter number?");
     num=Integer.parseInt(br.readLine());
     while(num>0)
     {
        r=num%10;
        sum=sum+r;
        num=num/10;

     }
     System.out.println("sum of digits:"+sum);
    }    
}
