package Assignment4;
class Student
{
    int rollNo;
    String Name;
    double Marks;
    
    Student(int rn,String n,double m)
    {
       rollNo = rn;
       Name = n;
       Marks = m;
    }
    
   void Display ()
   {
       System.out.println("rollNo :"+rollNo);
        System.out.println("Name :"+Name);
         System.out.println("Marks :"+Marks);
         
          System.out.println();
   }
   
   public static void main (String args[])
   {
       Student s = new Student(101,"Ram",85);
       Student s1 = new Student (102,"Laxman",80);
       s.Display();
       s1.Display();
   }
}