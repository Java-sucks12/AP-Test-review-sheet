//If they ask about this I am sorry

class LinkedList{
 static class Node{
  int value;
   Node next;
   
   public Node(int value){
    this.value = value; 
   }
 }
  Node first = null;
  
  public void addAtFront(Node node){
   node.next = first;
    first = node;
  }
  
  public void addAtEnd(Node node){
   if (first == null){
     first = node;
   }
    else{
      Node ptr = first;
      while(ptr.next != null){
        ptr = ptr.next;
      }
      ptr.next = node;
    }
    
    public void removeFront(){
     first = first.next; 
    }
    public void print(){
     Node ptr = first;
      while (ptr != null){
       System.out.println(ptr.value + " -> ");
        ptr = ptr.next;
      }
    }
    
  }
  
}
