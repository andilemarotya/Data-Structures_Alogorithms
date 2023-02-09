import java.util.Hashtable;

public class Hashtables {
    public static void main(String[] args){

        Hashtable<Integer, String> hashtable = new Hashtable<>(10);

        hashtable.put(100, "Naruto");
        hashtable.put(123, "Sasuke");
        hashtable.put(321, "Hashirama");
        hashtable.put(555, "Madara");
        hashtable.put(777, "Tobirama");
        hashtable.put(404, "Izuna");

        System.out.println(hashtable.get(123));

        for (Integer key: hashtable.keySet()) {
            System.out.println(key + "\t" + hashtable.get(key));
        }

        hashtable.remove(404);
    }
}
