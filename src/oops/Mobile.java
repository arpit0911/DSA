package oops;

public class Mobile {
    int RAM;
    int storage;
    String name;
    String OS;

    public Mobile(int RAM, int storage, String name, String OS){
        this.RAM= RAM;
        this.storage=storage;
        this.name=name;
        this.OS=OS;
    }
    public void printSpecification(){
        System.out.println("Ram= " +RAM);
        System.out.println("storage= " +storage);
        System.out.println("name= " +name);
        System.out.println("Ram= " +RAM);
    }

}
