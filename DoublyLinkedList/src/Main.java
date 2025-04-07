public class Main {
    public static void main(String[] args) {

        //Testing
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(); // Creates a DoublyLinkedList

        //Adding some elements to last of list
        for(int i=0;i<5;i++){
            list.addLast(i);
        }

        System.out.println(list);

        // Adding some elements to first of list
        for(int i=0;i<5;i++){
           list.addFirst(i);
        }
        System.out.println(list);


        //Finds a node in list
        Node<Integer> temp = list.head.getNext();
        if(!list.isEmpty()){
            while(temp.getData()!=2){
                temp=temp.getNext();
            }
            if(temp.getData()==2){
                list.addBetween(10,temp,temp.getNext()); //Adding a element between 2 nodes
            }
            else{
                System.out.println("List has not element `2` ");
            }
        }

        System.out.println(list);
    }
}