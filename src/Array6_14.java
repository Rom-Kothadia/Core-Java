public class Array6_14 {
    public static void main(String[] args) {
        Display A = new Display();
        A.show(1);

    }
}
class Display{
    public void show(int ...a){
        for (int i : a)
        System.out.print(i+", ");
    }/*
    public void show(int a){
        System.out.println(a+" Rom");
    }*/
}
