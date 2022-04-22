public class Main {

    public static void main(String arg[]) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener1 = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
        Worker worker1 = new Worker(listener1);
        worker1.error();

    }
}
