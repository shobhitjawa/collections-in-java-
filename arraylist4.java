import java.util.*;
public class ArrayList5{  
 public static void main(String[] args){  
  Student s1=new Student(101,"Shobhit",14);  
  Student s2=new Student(102,"Sanchit",24);  
  Student s3=new Student(103,"Samarpit",22);  
  ArrayList<Student> al=new ArrayList<Student>();  
  al.add(s1);
  al.add(s2);  
  al.add(s3);  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
 }  
}  
 class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  