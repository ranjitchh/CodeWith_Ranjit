interface xyz
{
    public void functionx();
}

interface msd
{
    public void functionm();
}

interface pqr extends xyz,msd{
    public void functionp();
}

class abc implements pqr
{
    public void functionx()
    {
        System.out.println("void functionx()");
    }
    public void functionm()
    {
       System.out.println("void functionm()");
    }
    public void functionp()
    {
        System.out.println("void functionp()");
    }
}

public class MultipleInherit {
  public static void main(String[] args) {
    abc a1=new abc();
    a1.functionx();
    a1.functionm();
    a1.functionp();
  }    
}
