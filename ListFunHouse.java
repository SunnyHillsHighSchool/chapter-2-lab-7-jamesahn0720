import static java.lang.System.*;

public class ListFunHouse
{
 //this method will print the entire list on the screen
   public static void print(ListNode list)
   {
    ListNode curNode = list;

        while (curNode != null) {
            System.out.print(curNode.getValue() + " ");
            curNode = curNode.getNext();
        }
   }  
 
 //this method will return the number of nodes present in list
 public static int nodeCount(ListNode list)
 {
    int count=0;
   while (list != null) {
            ++count;
            list = list.getNext();
        }
  return count;
 }
  
 //this method will create a new node with the same value as the first node and add this
 //new node to the list.  Once finished, the first node will occur twice.
 public static void doubleFirst(ListNode list)
 {
   ListNode doubleNode = new ListNode(list.getValue(), list.getNext());
        list.setNext(doubleNode);
 }

 //this method will create a new node with the same value as the last node and add this
 //new node at the end.  Once finished, the last node will occur twice.
 public static void doubleLast(ListNode list)
 {
    ListNode prev=null;
  ListNode curNode = list;

        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }

        curNode.setNext(new ListNode(curNode.getValue(), null));
 }
  
 //method skipEveryOther will remove every other node
 public static void skipEveryOther(ListNode list)
 {
   if (list == null) {
            return;
        }
        else if (list.getNext() != null) {
            list.setNext(list.getNext().getNext());
        }
        else if (list.getNext() == null){
            list.setNext(null);
        }
 }

 //this method will set the value of every xth node in the list
 public static void setXthNode(ListNode list, int x, Comparable value)
 {
   ListNode curNode = list;

        for (int i = 1; curNode != null; ++i) {
            if (i % x == 0) {
                System.out.println("i: " + i + "; Setting value " + curNode.getValue() + " to " + value);
                curNode.setValue(value);
            }
            curNode = curNode.getNext();
        }
 } 

 //this method will remove every xth node in the list
 public static void removeXthNode(ListNode list, int x)
 {
   ListNode curNode = list;

        for (int i = 1; curNode != null; ++i) {
            if ((i + 1) % x == 0) {
                skipEveryOther(curNode);
                curNode = curNode.getNext();
            }
        }
 }  
}
