import java.util.*;
 public class MyClass {
    public static void main(String args[]) {
     HashSet<String> h1=new HashSet<String>();
     HashSet<String> h2=new HashSet<String>();
     h1.add("shobhit");
     h1.add("jawa");
     h1.add("shubham");
     h1.add("shukla");
     h2.add("hell");
     //h2.addAll(h1);
     if(h2.equals(h1))
     {
        System.out.print("yes");
     }
     else
     System.out.print("no");
    }
}