import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(3);

        for(int i=0;i<9;i++){
            Runnable task=new Task(i);
            ex.submit(task);
        }
        ex.shutdown();
    }
    }


class Task extends Thread{
    private int tid;
    public Task(int t){
        this.tid=t;
    }
    public void run(){
        System.out.println("task"+tid+"is being executed by"+Thread.currentThread());

        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("Interrupted");
        }

        System.out.println("completely executed");
    }
}
