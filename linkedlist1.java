import java.util.*;  
public class TestJavaCollection2{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
al.remove("Ajay");
LinkedList<String> a2=new LinkedList<String>();
a2.addAll(al);
if(a2.contains("Ravi"))
{
    System.out.print("detected");
    System.out.println();
}
Iterator<String> itr=a2.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
LinkedList<Integer> a3=new LinkedList<Integer>();
a3.add(12);
a3.add(84);
a3.add(32);
a3.add(02);
Collections.sort(a3);
System.out.print(a3);
System.out.println();
Iterator<Integer> itr2=a3.iterator();
while(itr2.hasNext())
{
    System.out.println(itr2.next());
}
}  
} 