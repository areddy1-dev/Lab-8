
public class LinkedQueue<T> implements QueueADT<T> {
	private int count;
	private LinearNode<T> head, tail;
	 //Creates an empty queue.
	public LinkedQueue() {
		count = 0;
		head = tail = null;
	}
	 //Adds the specified element to the tail of this queue.
	 //@param element the element to be added to the tail of the queue
	public void enqueue(T element) {
		LinearNode<T> node = new LinearNode<T>(element);

		if (isEmpty())
			head = node;
		else
			tail.setNext(node);

		tail = node;
		count++;
	}

	 //Removes the element at the head of this queue and returns a reference to it.
	 //@return the element at the head of this queue
	 //@throws EmptyCollectionException if the queue is empty.
	public T dequeue() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		T result = head.getElement();
		head = head.getNext();
		count--;

		if (isEmpty())
			tail = null;

		return result;
	}
	public T first() throws EmptyCollectionException {
		// return null;
		// To be completed as a Programming Project
		return head.getElement();
	}
	public boolean isEmpty() {
		// return false;
		// To be completed as a Programming Project
		return count == 0;
	}
	public int size() {
		return count;
		// To be completed as a Programming Project
	}
	public T removeMiddle() {
		// Corner cases
		if (isEmpty()) {
			throw new EmptyCollectionException("queue");
		}
		if (count == 1 || count == 2) {
			System.out.println("Has to have at least 3 elements.");
		}
		
		// The index of the middle element.
		int middle = (count - 1) / 2;
		// Create a dummy head to help delete the middle node.
		LinearNode<T> dummyHead = new LinearNode<T>();
		dummyHead.setNext(head);
		
		LinearNode<T> cur = head;
		LinearNode<T> prev = dummyHead;
		
		// Find the middle element.
		while (middle != 0) {
			prev = cur;
			cur = cur.getNext();
			middle--;
		}
		
		// Record the value of the middle element.
		T result = cur.getElement();
		// Delete the middle element.
		prev.setNext(cur.getNext());

		count--;

    //		if (isEmpty()) {
    //			tail = null;
    //		}

		return result;

	}
	public String toString() {
		// return null;
		// To be completed as a Programming Project
		String str = "";

		LinearNode<T> cur = head;
		while (cur != null) {
			str += cur.getElement() + " ";
			cur = cur.getNext();
		}

		return str;
	}

	public boolean isEmpty1() {
		// TODO Auto-generated method stub
		return false;
	}
}
