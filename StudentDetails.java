import java.util.Scanner;
   class Student
   {
      String  USN,Name,Branch,Phone;
      Scanner input=new Scanner(System.in);
      void read()
      {
        System.out.print("Enter USN:");
        USN = input.nextLine();
        
        System.out.print("Enter Name:");
        Name = input.nextLine();
        
        System.out.println("Enter Branch:");
        Branch = input.nextLine();

        System.out.println("Enter Phone:");
        Phone = input.nextLine();
       }
       void display()
       {
           System.out.printf("%-20s %-20s %-20s %-20s",USN,Name,Branch,Phone);
       }
    }
    public class StudentDetails
    {
       public static void main(string[] args)
        {
           Scanner  input = new Scanner(System.in);
           System.out.println("student details entry program");
           System.out.println("-------------------------------");
           System.out.println("Enter number of Student Details to be created:");
           int number = input.nextInt();

           Student s[] = new Student[number];

        // Read Student details into array of student objects
        for(int i=0; i< number;i++)
        { 
           System.out.println("\nEnter Student -"+(i+1)+"Details");
           System.out.println("----------------------------------");
           s[i] = new Student();
           s[i].read();
        }
        
        // Display Student information
        System.out.println("\n%-20s %-20s %-20s %-20s","USN","NAME","BRANCH","PHONE");
         for(int i=0; i< number;i++)
        { 
           System.out.println();
           s[i].display();
        }
        input.close();
      }
  }