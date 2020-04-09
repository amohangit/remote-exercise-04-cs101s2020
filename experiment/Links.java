public class Links extends Node {
    private Node head, tail;
    private int size;
	public Links() {
		head = null;
		size = 0;
    } //constructor
    public int get(int index) {
        if(size < 1 || index >= size || index < 0) {
            //index not valid
            System.out.println("Index is out of bounds - get()");
        }
        Node curr = head;
        int pos = 0;
        while(pos < index) {
            curr = curr.getNext();
            pos++;
        }
        return curr.getData();
    } //get
    public void add(int obj) {
        if(size<1) {
			// add new node as head
            head = new Node(obj);
            tail = head;
            size = 1;
        } else {
			// add new node after tail (the last node)
            tail.setNext(new Node(obj));
            tail = tail.getNext();
            size++;
        }
    } //add
    public void remove(int index) {
        if(index >= size || index < 0) {
            //index not valid
            System.out.println("Index is out of bounds - remove()");
        }
        if(index == 0) {
            //removing head
            head = head.getNext();
            //removing single node left
            if(size == 1) {
                tail = null;
            }
        } else {
            //regular
            Node curr = head.getNext(); // node 1
            Node prev = head; // node 0
            int pos = 1;
            while(pos < index) {
                curr = curr.getNext();
				prev = prev.getNext();
                pos++;
            }
            prev.setNext(curr.getNext());
            //update tail if it was removed
            if(index == size-1) {
                tail = prev;
            }
        }
        size--;
    } //remove

    public int size() {
        return size;
    } //size
}