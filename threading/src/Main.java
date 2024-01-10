public class Main {
    public static void main(String[] args) {
        kronometre thread1 = new kronometre("thread1");
        kronometre thread2 = new kronometre("thread2");
        kronometre thread3 = new kronometre("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}