package Assignment_2_4;

public class LinearQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public LinearQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue value: " + value);
            return;
        }
        queue[rear] = value;
        rear++;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue value.");
            return null;
        }
        int value = queue[front];
        front++;
        return value;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 5;
        LinearQueue linearQueue = new LinearQueue(size);

        linearQueue.enqueue(10);
        linearQueue.display();

        linearQueue.enqueue(20);
        linearQueue.display();

        linearQueue.enqueue(30);
        linearQueue.display();

        System.out.println("Dequeued: " + linearQueue.dequeue());
        linearQueue.display();

        linearQueue.enqueue(40);
        linearQueue.display();

        linearQueue.enqueue(50);
        linearQueue.display();

        linearQueue.enqueue(60); // This will show that the queue is full
        linearQueue.display();
    }
}
