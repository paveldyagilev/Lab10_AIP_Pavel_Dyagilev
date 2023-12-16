public class Dog extends Animal {
    @Override
    public void run(double distance) {
        if ((distance < 500.1)) {
            System.out.println("dog run true");
        }
        else{System.out.println("dog run false");}
    }

    @Override
    public void jump(double height) {
        if ((height < 0.6)) {
            System.out.println("dog jumps true");
        }
        else{System.out.println("dog jumps false");}
    }

    @Override
    public void swim(double meters) {
        if ((meters < 10.1)) {
            System.out.println("dog swim true");
        }
        else{System.out.println("dog swim false");}
    }
}