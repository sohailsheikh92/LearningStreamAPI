@FunctionalInterface
interface ImplementingLambda{
    public void lambda();
//    public void lambda2();
}

public class LamdaExp {
    public static void main(String[] args) {
        ImplementingLambda im ;
        im=() -> {
            System.out.println("implemented lambda expression");
        };
        im.lambda();
    }
}
