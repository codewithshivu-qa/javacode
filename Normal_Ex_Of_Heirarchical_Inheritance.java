//This is normal and common example//
package hierarchicalinheritance;

//Parent class
class person
{
 void introduce() 
 {
     System.out.println("I am a person in the institution.");
 }
}

//Child class 1
class Teacher extends person
{
 void teach() 
 {
     System.out.println("I am teaching students.");
 }
}

//Child class 2
class Student extends person
{
 void study() 
 {
     System.out.println("I am studying subjects.");
 }
}

//Child class 3
class Staff extends person
{
 void work() 
 {
     System.out.println("I am managing administrative work.");
 }
}

//Main class to test the hierarchy
public class Normal_Ex_Of_Heirarchical_Inheritance
{
 public static void main(String[] args) {
     // Teacher object
     Teacher t = new Teacher();
     t.introduce();
     t.teach();

     System.out.println();

     // Student object
     Student s = new Student();
     s.introduce();
     s.study();

     System.out.println();

     // Staff object
     Staff st = new Staff();
     st.introduce();
     st.work();
 }
}
