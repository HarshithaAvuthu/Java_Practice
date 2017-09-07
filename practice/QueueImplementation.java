import java.util.*;
public class QueueImplementation {

    int arr[] = new int[10];
    private int n = 0;

    public void enqueue(int x){
        arr[n++]=x;

    }

    public int dequeue(){
        int temp=arr[0];
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
        n--;
        return temp;
    }

    public int size(){
        return n;
    }
    public int poll(){
        return arr[0];
    }

    public String toString(){
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {

        QueueImplementation q = new QueueImplementation();

        System.out.println(q);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q);
        System.out.println("Poped element: "+q.dequeue());
        System.out.println(q);


    }

}