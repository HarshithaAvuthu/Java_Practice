import java.util.*;
class HashExample
{
    public static void main(String[] args) {
        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put("venky",50);
        ht.put("vikas",100);
        ht.put("kishore",200);


        // ht.put("venky",90);
        // System.out.println(ht.get("venky"));
        // ht.remove("venky");
        // System.out.println(ht.get("venky"));
        for(String s:ht.keySet())
        {
            ht.put(s,ht.get(s)+30);
            System.out.println(s);
        }
        System.out.println(ht.get("venky"));
        System.out.println(ht.get("vikas"));
        System.out.println(ht.get("kishore"));
    }
}