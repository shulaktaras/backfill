package test2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String type, int id) {
        super(type, id);
    }

    public void jump() {
        System.out.println("cat jump");
    }

}
