public class LearningGenerics {
    public static void main(String[] args) {
        Generics<String> obj=new Generics<>();
        obj.setData("ALhamdulillah");
        String print= obj.getData();
        System.out.println(print);

    }
}

class Generics<T>{
    private T var;
    public void setData(T v){
        var=v;
    }
    public T getData(){
        return var;
    }
}
