public class LearningGenerics {
    public static void main(String[] args) {
        Generics<String> obj=new Generics<>();
        obj.setData("ALhamdulillah");
        System.out.println(obj.setData());

    }
}

class Generics<T>{
    private T var;
    public void setData(T v){
        var=v;
    }
    public T setData(){
        return var;
    }

}
