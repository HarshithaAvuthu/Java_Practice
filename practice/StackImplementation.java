import java.util.*;
public class StackImplementation {
    int arr[] = new int[10];
    private int n = 0;

    public void push(int x){
        arr[n++] = x;

    }

    public int pop(){

        int t = arr[--n];
        arr[n]=0;
        return t;
    }

    public int size(){
        return n;
    }
    public int peek(){
        return arr[n-1];

    }

    public String toString(){
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {

        StackImplementation st = new StackImplementation();

        System.out.println(st);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println("Poped element: "+st.pop());
        System.out.println(st);


    }

}