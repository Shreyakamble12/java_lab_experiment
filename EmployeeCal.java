/*Experiment No :3 */
import java.util.Scanner;

class Employee
{
String name,n1;
int id,i1;
double sal,s1;

Employee(String n,int eid,double s)
{
  n1=n;
  i1=eid;
  s1=s;
}

void setname(String n1)
{
name=n1;
}

String getname()
{
return name;
}

void setid(int i1)
{
id=i1;
}

int getid()
{
return id;
}

void setsalary(double s1)
{
sal=s1;
}

double getsalary()
{
return sal;
}

void setsalary1(double s1)
{
sal=s1;
}

double getsalary1()
{
double p=sal+sal*0.1;
return p;
}
}

class EmployeeCal
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String n;
int eid;
double s;

System.out.print("Enter the name of Employee :");
n=sc.next();

System.out.print("Enter the id of Employee :");
eid=sc.nextInt();

System.out.print("Enter the salary of Employee :");
s=sc.nextDouble();

Employee emp =new Employee(n,eid,s);

emp.setname(n);
String sname=emp.getname();
System.out.println("name  :"+sname);

emp.setid(eid);
int emid=emp.getid();
System.out.println("Id  :"+emid);

emp.setsalary(s);
double sa=emp.getsalary();
System.out.println("Salary :"+sa);

emp.setsalary1(s);
double in=emp.getsalary1();
System.out.println("Incremented Salary:"+in);

}
}
