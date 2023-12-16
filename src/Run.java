public class Run {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.run(500);
        cat.run(200);
        dog.jump(0.5);
        cat.jump(2);
        dog.swim(10);
        cat.swim(0);
    }
}
