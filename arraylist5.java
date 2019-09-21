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
  ArrayList<Student> l1=new ArrayList<Student>();
  l1.addAll(al);            //using addAll
  Iterator itr1=l1.iterator();
  while(itr1.hasNext()){  
    Student st1=(Student)itr1.next();  
    System.out.println(st1.rollno+" "+st1.name+" "+st1.age);  
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