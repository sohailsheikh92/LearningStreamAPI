@FunctionalInterface
interface ImplementingLambda{
    public void lambda();
//    public void lambda2();
}

interface ImplementingLambda2
{
    //lambda with arguments
    public int add(int x,int y);
}

interface Evenornot{
    public void check(int x);
}
public class LamdaExp {
    public static void main(String[] args) {
//        ImplementingLambda im ;
//        im=() -> {
//            System.out.println("implemented lambda expression");
//        };
//        im.lambda();
//        ImplementingLambda2 im2 = (a,b)->{
//            return (a+b);
//        };
//        System.out.println(im2.add(4,4));

        Evenornot e =(a)->{
            if(a%2==0)
                System.out.println("even");
            else
                System.out.println("not even");
        };
        e.check(5);
    }
}
