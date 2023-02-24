package creational.Singleton;

public class Singleton{
    public static Singleton uniqueinstance;
    public Singleton(){}
    public static Singleton getInstance(){
        if(uniqueinstance == null){ return new Singleton();}
        return uniqueinstance;
    }

    public void getDescription(){
        System.out.println("I am simple Singleton");
    }
}
