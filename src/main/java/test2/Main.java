package test2;

public class Main {
    public static void main(String[] args) {


//        Animal cat = new Cat();
//        cat.setId(100);
//        System.out.println(cat);
//        cat.say("asd");
//
//        cat.jump();
//
        test(new Bird());

    }

    public static void test(Animal animal){
        animal.jump();
    }

}
