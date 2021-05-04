# Chapter-2-Lab-7

**Lab Goal :** This lab was designed to teach you more about a linked list and passing a linked list as a parameter.

**Lab Description :** Use  ListNode  to write some basic LinkedList methods. 

PART 1 – Open the  ListFunHouse.java  file and complete the methods in this class. 

PART 2 – Use  ListFunHouseRunner.java  to test your ListFunHouse class.

**ListNode – stores a value and a reference to the next node**
 
public class ListNode implements Linkable

{

private Comparable listNodeValue;

private ListNode nextListNode;

public ListNode(){

listNodeValue = null;

nextListNode = null;

}

public ListNode(Comparable value, ListNode next){

listNodeValue=value;

nextListNode=next;

}

public Comparable getValue(){

 return listNodeValue;

}

public ListNode getNext(){

return nextListNode;

}

public void setValue(Comparable value){

listNodeValue = value;

}

public void setNext(Linkable next){

nextListNode = (ListNode)next;

}

}

**Sample Data :** 

See Main 

**Sample Output :**

go on at 34 2.1 -a-2-1 up over

num nodes = 8

List values after calling nodeCount

go on at 34 2.1 -a-2-1 up over

List values after calling doubleFirst

go go on at 34 2.1 -a-2-1 up over

List values after calling doubleLast

go go on at 34 2.1 -a-2-1 up over over

List values after calling removeXthNode(2)

go on 34 -a-2-1 over

List values after calling setXthNode(2,one)

go one 34 one over  
