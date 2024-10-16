package topic_4_queue;

public class Main {

	public static void main(String[] args) {
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Jeffry"));
	     customerQueue.enqueue(new Customer("Chooxs"));
	     customerQueue.enqueue(new Customer("Tiborssho"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}

}
