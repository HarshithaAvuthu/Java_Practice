import java.util.*;
public class MergeSort {

    public void mergeSort(int arr[]){

        int len = arr.length;
        if(len ==1 ){
            return ;
        }
        int mid = len/2;
        int[] arr1 = new int[mid];
        int [] arr2 = new int[len-mid];

        for(int i =0;i<arr1.length;++i){
            arr1[i] = arr[i];
        }

        mergeSort(arr1);
        for(int j = 0;j<arr2.length;++j){
            arr2[j] = arr[mid++];
        }
        mergeSort(arr2);

        int x=0;
        int y=0;
        int z=0;
        while (x<arr1.length && y<arr2.length) {
                if (arr1[x]<arr2[y]) {
                    arr[z++] = arr1[x++];
                }else {
                    arr[z++] = arr2[y++];
                }

        }
        while (y<arr2.length) {
            arr[z++]=arr2[y++];
        }
        while (x<arr1.length) {
            arr[z++]=arr1[x++];
        }




    }



    public static void main(String[] args) {
        int arr[] = {8,5,3,1,2,7,4,6};
        MergeSort mg = new MergeSort();

        mg.mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}