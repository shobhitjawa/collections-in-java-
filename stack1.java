import java.util.*;  
public class TestJavaCollection4{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");  
//stack.pop();
String s=stack.peek();
Collections.sort(stack);
System.out.print(stack);
Iterator<String> itr=stack.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
System.out.print(s);
}  
}  