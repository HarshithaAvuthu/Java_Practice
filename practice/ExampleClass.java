public class ExampleClass{

    int a = 10;
    int b = 20;

    @Override
    public String toString(){
        return a+" "+b;
    }

    public static void main(String[] args) {

        ExampleClass obj = new ExampleClass();
        System.out.println(obj);
    }
}