abstract class Department{
    double salary,bonus,totalsalary;
    public abstract void calbonus(double salary);
    public void displaytotalsalary(String dept)
    {
        System.out.println(dept+"\t"+salary+"\t\t"+bonus+"\t"+totalsalary);
    }
}
class accounts extends Department
{
public void calbonus(double sal)
{
    salary=sal;
    bonus=sal*0.2;
    totalsalary=salary+bonus;
}
}
class sales extends Department{
    public void calbonus(double sal)
    {
        salary=sal;
        bonus=sal*0.3;
        totalsalary=salary+bonus;
    }
}
public class Bonus{
public static void main(String[] args) {
    Department acc=new accounts();
    Department sales=new sales();
    acc.calbonus(10000);
    sales.calbonus(20000);
    System.out.println("department \t basicsalary \t bonus \t totalsalary");
    System.out.println("------");
    acc.displaytotalsalary("accounts");
    sales.displaytotalsalary("salesdep");
    System.out.println("--------");
}
}
