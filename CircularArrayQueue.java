
public class CircularArrayQueue<T> implements QueueADT<T>
{
    private final static int DEFAULT_CAPACITY = 100;
    private int front, rear, count;
    private T[] queue; 
  
     //Creates an empty queue using the specified capacity.
     //@param initialCapacity the initial size of the circular array queue
	 @SuppressWarnings("unchecked")
	public CircularArrayQueue (int initialCapacity)
    {
        front = rear = count = 0;
        queue = (T[]) (new Object[initialCapacity]);
    }
    public CircularArrayQueue()
    {
        this(DEFAULT_CAPACITY);
    }    
    public void enqueue(T element)
    {
        if (size() == queue.length) 
            expandCapacity();
    
        queue[rear] = element;
        rear = (rear+1) % queue.length;
    
        count++;
    }
    private void expandCapacity()
    {
        @SuppressWarnings("unchecked")
		T[] larger = (T[]) (new Object[queue.length *2]);
    
        for (int scan = 0; scan < count; scan++)
        {
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
    
        front = 0;
        rear = count;
        queue = larger;
    }
    public T dequeue() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");
    
        T result = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
    
        count--;
    
        return result;
    }
    public T first() throws EmptyCollectionException
    {
		// return null;
        // To be completed as a Programming Project
    	return queue[front];
    }
    public boolean isEmpty()
    {
		// return false;
        // To be completed as a Programming Project
    	return count == 0;
    }
    public int size()
    {
		return count;
        // To be completed as a Programming Project
    }
    public String toString()
    {
		return null;
        // To be completed as a Programming Project
    }
}