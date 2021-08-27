public class Driver {

	public static void main(String[] args) {
		System.out.println("Exercise 1: ");
		// 1.1 Create an instance of an CircularArrayQueue class.
		CircularArrayQueue<Integer> arrayQ = new CircularArrayQueue<Integer>();
		// 1.2 Enqueue ints into ArrayQ.
		for (int value : new int[] { 1, 7, 3, 4, 9, 2 }) {
			arrayQ.enqueue(value);
		}
		// 1.3 Dequeue all the elements from the ArrayQ, displaying each int as it's
		// removed.
		System.out.println("The size of the ArrayQ is: " + arrayQ.size());
		System.out.print("ArrayQ: ");
		while (!arrayQ.isEmpty()) {
			System.out.print(arrayQ.first() + " ");
			arrayQ.dequeue();
		}
		System.out.println();

		// 2.1 Create an instance of an LinkedQueue class.
		LinkedQueue<Integer> linkedQ = new LinkedQueue<Integer>();
		// 2.2 Enqueue ints into linkedQ.
		for (int value : new int[] { 1, 7, 3, 4, 9, 2 }) {
			linkedQ.enqueue(value);
		}
		// 2.3 Dequeue all the elements from the linkedQ, displaying each int as it's
		// removed.
		System.out.println("The size of the linkedQ is: " + linkedQ.size());
		System.out.print("linkedQ: ");
		while (!linkedQ.isEmpty()) {
			System.out.print(linkedQ.first() + " ");
			linkedQ.dequeue();
		}
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Exercise 2: ");
		// Case 1
		for (int value1 : new int[] { 1, 7, 3, 4, 9, 2 }) {
			linkedQ.enqueue(value1);
		}
		
		// Case 2
//		for (int value2 : new int[] { 1, 7 }) {
//			linkedQ.enqueue(value2);
//		}
		
		// Case 3
//		for (int value3 : new int[] { 1 }) {
//			linkedQ.enqueue(value3);
//		}
		
		// Case 4
//		for (int value4 : new int[] {}) {
//			linkedQ.enqueue(value4);
//		}
		
		System.out.println("The size of the linkedQ is: " + linkedQ.size());
		linkedQ.removeMiddle();
		System.out.print("linkedQ: ");
		System.out.println(linkedQ);
		
		System.out.println("--------------------------------------------------------");
		
		
	}
}