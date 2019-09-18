public class AnimalApp {
    public static void main(String[] args){
        Animal a = new Animal();
        System.out.println(a.eat());
        System.out.println(a.sleep());
        System.out.println("----------------------------------------------------");

        Cat c = new Cat();
        System.out.println(c.eat());
        System.out.println(c.sleep());
        System.out.println(c.purr());
        System.out.println("----------------------------------------------------");

        Bird b = new Bird ();
        System.out.println(b.eat());
        System.out.println(b.sleep());
        System.out.println(b.fly());
        System.out.println("----------------------------------------------------");

        Dog d = new Dog();
        System.out.println(d.eat());
        System.out.println(d.sleep());
        System.out.println("----------------------------------------------------");

        Mouse m = new Mouse();
        System.out.println(m.eat());
        System.out.println(m.sleep());



    }
//   // private static void print(String s){
//        System.out.println(s);
//    }

}
