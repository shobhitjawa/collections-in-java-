import java.util.*;  
public class TestJavaCollection2{  
public static void main(String args[]){  
LinkedList<Integer> a3=new LinkedList<Integer>();
a3.add(12);
a3.add(84);
a3.add(32);
a3.add(84);
a3.add(02);
LinkedList<Integer> a4=new LinkedList<Integer>();
for(Integer x:a3)
{
if(!a4.contains(x))   // remove duplicates from stack.
{
    a4.add(x);
}
}
System.out.print(a4);
}
}