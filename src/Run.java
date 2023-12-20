public class Run {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        System.out.println("cat run " + cat.run(180));
        System.out.println("cat jump " + cat.jump(1));
        System.out.println("cat swim " + cat.swim(5));
        Dog dog = new Dog("Sharik");
        System.out.println("dog run " + dog.run(480));
        System.out.println("dog jump " + dog.jump(0.4));
        System.out.println("dog swim " + dog.swim(5));
    }
}
