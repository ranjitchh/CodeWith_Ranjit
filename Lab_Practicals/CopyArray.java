public class CopyArray{
    public static void main(String[] args) {
        int a1[]={10,20,30,40,50};
        int a2[]=new int[5];
        System.out.println("elements of a1:");
        for(int var:a1)
        {
            System.out.println(" "+var);
        }
        System.out.println("elements of a2:");
        for(int j=0;j<a1.length;j++)
        {   a2[j]=a1[j];
            System.out.println(" "+a2[j]);
        }

    }
}
