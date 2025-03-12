import java.util.*;
import java.util.stream.Stream;

public class StreamAPI extends Thread
{

    public void run(){
            int i=0;
            while(i<100){
                System.out.print("Hello"+" ");
                i++;
            }
    }

    public static void main(String[] args) {
        List<Integer> li=List.of(1,2,3,4,5);
        Stream<Integer> s=li.stream();
//        s.forEach((x)-> System.out.println(x));


        //MultiThreading
        StreamAPI obj=new StreamAPI();
        obj.start();
        int i=0;
        while(true){
            System.out.print("World"+" ");
            i++;
            Thread.yield();//allows another thread to run
        }
    }
}
