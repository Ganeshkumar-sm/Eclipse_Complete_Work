package queueExample;

class QueueUsingArray {
	int front_Q, rear_Q;
	int capacityOfQueue;
	static int q1[];

	QueueUsingArray(int size) {
		capacityOfQueue = size;

		q1 = new int[capacityOfQueue];

		int ln = q1.length;

		System.out.println("length : " + ln);

	}

	void enQueue(int value) {
		if (rear_Q == capacityOfQueue) {
			System.out.println("Queue is Already full,\nyou can't insert Element");
		} else {
			q1[rear_Q] = value;
			rear_Q++;
		}
		// System.out.println("Rear Queue: "+rear_Q);

	}

	void deQueue() {
		if (rear_Q == 0) {
			System.out.println("Queue is Empty, there is nothing to delete");
		} else {
			for (int i = 0; i < rear_Q - 1; i++) {
				q1[i] = q1[i + 1];
			}
			rear_Q--;
		}

	}

	void display1() {
		if (rear_Q == 0) {
			System.out.println("Queue is Empty, there is nothing to Display");
		} else {
			for (int i = 0; i < rear_Q; i++) {
				System.out.print(q1[i] + " ");
			}
		}
		System.out.println();
	}

	void deQueue1() {
		if (rear_Q == 0) {
			System.out.println("Queue is Empty, there is nothing to delete");
		} else {
			for (int i = 0; i < rear_Q - 1; i++) {
				q1[i] = q1[i + 1];
			}
			rear_Q--;
		}

	}

	void display() {
		if (rear_Q == 0) {
			System.out.println("Queue is Empty, there is nothing to Display");
		} else {
			for (int i = 0; i < rear_Q; i++) {
				System.out.print(q1[i] + " ");
			}
		}
	}
}

public class QueueSolution {

	public static void main(String[] args) {
		QueueUsingArray q2 = new QueueUsingArray(5);

		q2.enQueue(5);
		q2.enQueue(9);
		q2.enQueue(22);
		q2.enQueue(8);
		q2.enQueue(14);
		q2.display();
		System.out.println();
		q2.deQueue();
		q2.display1();
		q2.deQueue1();
		q2.display();

	}

}
