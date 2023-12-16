public class Cat extends Animal {
    @Override
    public void run(double distance) {
        if ((distance < 200.1)) {
            System.out.println("cat run true");
        }
        else{System.out.println("cat run false");}
    }

    @Override
    public void jump(double height) {
        if ((height < 2.1)) {
            System.out.println("cat jumps true");
        }
        else{System.out.println("cat jumps false");}
    }

    @Override
    public void swim(double meters) {
        if ((meters < 0.1)) {
            System.out.println("cat swim true");
        }
        else{System.out.println("cat swim false");}
    }
}