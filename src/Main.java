public class Main {

    public static void main(String arg[]) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener1 = System.out::println;

        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}
