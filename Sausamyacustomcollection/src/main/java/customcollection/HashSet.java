package customcollection;


import java.util.HashSet;
import java.util.Iterator;


public class HashSet 
{
    public static void main(String args[])
    {
    HashSet<String> h =new HashSet<>();
    h.add("one");
    h.add("two");
    h.add("three");
    h.add("four");
    h.add("six");
    h.add("seven");
    h.add("eight");
    h.add("nine");
    h.add("ten");
    
    System.out.println(h);
    System.out.println("list  contains one or not:"+h.contains("one"));
    h.remove("two");
    System.out.println("list after removing two:"+h);
    System.out.println("Iterating over list:");
    Iterator<String>  i= h.iterator();
    while(i.hasNext())
    	System.out.println(i.next());
    for (String numbers: h)
    	System.out.println("using for each "+numbers);
    }
}


    
    
  

