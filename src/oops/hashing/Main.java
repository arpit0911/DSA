package oops.hashing;

public class Main {
    public static void main(String[] args) {
        // withCustomHM();
        
        withGenericHM();


    }

    private static void withGenericHM() {
        GenericHM<Integer, Boolean> hm =new GenericHM<>();
        hm.put(3, true);
        hm.put( 1, false );
        hm.put( 5, true);
        hm.put( 7, true);
        hm.put( 23, false);

        hm.display();
        System.out.println(hm.get(2));
        System.out.println(hm.containsKey(3));
        System.out.println(hm.remove(1));
    }

    private static void withCustomHM() {
        CustomHM hm=new CustomHM();
        hm.put("India", 3);
        hm.put("Ukrain", 1);
        hm.put("USA", 5);
        hm.put("China", 7);
        hm.put("pakistan", 23);

        hm.display();
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("India"));
    }
}
