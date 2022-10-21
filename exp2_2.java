//class name exp2_2

//Program on accepting input through keyboard.
//prog 2    
class Student2
{ private String name, city;
private int age;
public void getData(String x, String y, int t)
{
name=x; city=y; age =t;
}
public void printData()
{
System.out.println("Student name ="+name);
System.out.println("Student city ="+city);
System.out.println("Student age ="+ age);
}
}
public class exp2_2 { public static void main(String args[])
{
Student2 s1=new Student2();
Student2 s2=new Student2();
s2.getData("Kapil","Delhi",23);
s2.printData();
s1.getData("Amit","Dehradun",22);
s1.printData();
}
}

