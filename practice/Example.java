class Example1 {
 public static void main(String[] args) {
    System.out.println("hello world kadans algo");
    int n = 77150;
        int [] arr = new int[10];
        int r;
        while(n>0){
            r = n%10;
            arr[r]++;
            n=n/10;
        }

        for(int i=0;i<arr.length;i++)
        System.out.println(i+" "+arr[i]);
 }

}