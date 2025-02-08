public class Strings {

    static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s=new String(sb);
        return s;
    }

    public static void main(String[] args) {
//        System.out.println("Starting Strings");
        String s="Welcome to gfg";
        System.out.println(reverse(s));

    }

}
