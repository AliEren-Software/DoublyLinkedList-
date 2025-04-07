public class DoublyLinkedList <E>{
    Node<E> head;
    Node<E> tail;
    int size;

    DoublyLinkedList(){
        this.head=new Node<>(null,null,null);
        this.tail= new Node<>(head,null,null);
        this.head.setNext(tail);
        this.size=0;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void addBetween(E element,Node<E> prev,Node<E> nextt){
        Node<E> newNode = new Node<>(prev,element,nextt);
        prev.setNext(newNode);
        nextt.setPrevious(newNode);
        size++;
    }
    public E remove(Node<E> a){
        Node<E> prev = a.getPrevious();
        Node<E> next = a.getNext();

        prev.setNext(next);
        next.setPrevious(prev);
        size--;

        return a.getData();
    }

    public void addFirst(E element){
        addBetween(element,head,head.getNext());
    }
    public void addLast(E element){
        addBetween(element,tail.getPrevious(),tail);
    }

    public E removeFirst(){
        return remove(head.getNext());
    }
    public E removeLast(){
        return remove(tail.getPrevious());
    }

    @Override
    public String toString(){
        Node<E> newNode=head.getNext();
        if(newNode==null){
            return "List is Empty!";
        }
        else{
            String list ="List is: ";
            while(newNode.getNext()!=null){
                list+=newNode.getData()+"->";
                newNode=newNode.getNext();
            }
            list+=newNode.getData();
            return list;
        }
    }



}


