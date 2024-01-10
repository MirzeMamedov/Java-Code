public class kronometre implements Runnable{
    private Thread thread ;
    private String thread_name;
    public kronometre(String thread_name){
        this.thread_name = thread_name;
        System.out.println("olusturuluyor");
    }
    @Override
    public void run() {
        System.out.println("calistiriliyor : " + thread_name);
        try{
        for(int i = 0 ; i < 10 ; i ++) {
            System.out.println(thread_name + " " + i);
            Thread.sleep(1000);
        }}catch (InterruptedException exception){
            System.out.println("pozuldu " + thread_name );
        }
        System.out.println("thread qutardi" + thread_name);
        thread.run();
    }
    public void start(){
        System.out.println("thread olusuyor");
        if(thread == null){
            thread = new Thread(this,thread_name);
            thread.start();
        }
    }
}
