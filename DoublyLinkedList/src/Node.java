public class Node<E> {
    private Node<E> next;
    private Node<E> previous;
    private E data;

    Node(Node<E> previous,E data,Node<E> next){
        this.data=data;
        this.next=next;
        this.previous=previous;
    }

    Node(){
        this.next=null;
        this.data=null;
        this.previous=null;
    }

    public void setData(E data) {
        this.data = data;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
    public E getData() {
        return data;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public Node<E> getPrevious() {
        return previous;
    }
}