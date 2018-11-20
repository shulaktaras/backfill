package test2;

public abstract class Animal {
    private String type;
    private int id;

    public Animal() {
    }

    public Animal(String type, int id) {
        this.type = type;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void say(String phrase) {
        System.out.printf(phrase);
    }

    public abstract void jump();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}