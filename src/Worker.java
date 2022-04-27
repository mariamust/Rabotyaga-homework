public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.callback = callback;
        this.errorCallBack = errorCallBack;
    }

    private OnTaskDoneListener callback;

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    public Worker(OnTaskErrorListener errorCallBack) {
        this.errorCallBack = errorCallBack;
    }

    private OnTaskErrorListener errorCallBack;


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i > 33) {
                callback.onDone("Task " + i + " is done");
            }
            if (i < 33) {
                callback.onDone("Task " + i + " is done");
            } if (i == 33) {
                errorCallBack.onError("Task " + i + " on error");
            }
        }
    }
}




