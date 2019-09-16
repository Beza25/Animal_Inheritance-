public class AnimalApp {
    public static void main(String[] args){
        Animal a = new Animal();
        System.out.println(a.eat());
        System.out.println(a.sleep());

        Cat c = new Cat();
        System.out.println(c.eat());
        System.out.println(c.sleep());
        System.out.println(c.purr());

        Bird b = new Bird ();
        System.out.println(b.eat());
        System.out.println(b.sleep());
        System.out.println(b.fly());


    }
    private static void print(String s){
        System.out.println(s);
    }

}
