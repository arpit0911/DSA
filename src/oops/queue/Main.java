package oops.queue;

public class Main {
    public static void main(String[] args) {
        callQueue();
    }

    private static void callQueue() {
        Queue q = new Queue();

        q.add(15);
        q.add(10);
        q.add(1);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.size());

    }
}
