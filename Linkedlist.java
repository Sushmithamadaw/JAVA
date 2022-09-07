import java.util.*;
import java.util.LinkedList;
import java.util.List;
public class Linkedlist {
   public static void main(String[] args){
LinkedList<Character> ll= new LinkedList<Character>();
ll.add('B');
ll.add('E');
ll.add('F');
System.out.println("original contents:"+ll);
ll.addLast('G');
ll.addFirst('A');
System.out.println("After calls to addfirst() and addlast()");
System.out.println("contents:"+ll);
ll.add(2,'D');
ll.add(2,'C');
System.out.println("After insertion");
System.out.println("contents:"+ll);
System.out.println("Here the first and last elements are"+ll.getFirst()+" "+ll.getLast());
List<Character> sub=ll.subList(2,5);
System.out.println("Contents of sublist view:"+sub);
LinkedList<Character> ll2=new LinkedList<Character>(sub);
ll.removeAll(ll2);
System.out.println("After removing from ll");
System.out.println("contents:"+ll);
ll.removeFirst();
ll.removeLast();
System.out.println("After deleting first() and last() element");
System.out.println("contents:"+ll);
ll.set(0,Character.toLowerCase(ll.get(0)));
System.out.println("After change:"+ll);

   } 
}
