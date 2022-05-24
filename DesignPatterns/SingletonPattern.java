package DesignPatterns;

class Singleton{
    //One obj from this class like Binary next nodes.
    private static Singleton instance = null;

    //Attributes
    public int Id;

    //We can't create object from outside.
    private Singleton(){}

    //This function returns only one obj that Inside this class.
    public static Singleton getInstance(){
        if (instance==null) instance = new Singleton();
        return instance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton sg = Singleton.getInstance();
        sg.Id=1;
        Singleton sg2 = Singleton.getInstance();
        System.out.println(sg2.Id);//1
    }


}
