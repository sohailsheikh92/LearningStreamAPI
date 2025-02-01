@FunctionalInterface
interface ImplementingLambda{
    public void lambda();
//    public void lambda2();
}

interface ImplementingLambda2
{
    //lambda with arguments
    public void lambda2(String str);
}
public class LamdaExp {
    public static void main(String[] args) {
        ImplementingLambda im ;
        im=() -> {
            System.out.println("implemented lambda expression");
        };
        im.lambda();
        ImplementingLambda2 im2;
        im2 =(s) -> {
            System.out.println("lambda with arguments");
            System.out.println(s);
        };
        im2.lambda2("printed lamemda with arguments");
        //done
    }
}
