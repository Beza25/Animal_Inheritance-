public class Dog extends Animal {


    public Dog(){
        System.out.println("A papi is born");
    }
    @Override
    public String sleep(){
        return "A dog sleeps...";
    }
    @Override
    public String eat(){
        return "A dog eats bones.";
    }

}
