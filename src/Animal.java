
interface IAnimal {
    boolean run(double distance);

    boolean jump(double height);

    boolean swim(double meters);
}

public abstract class Animal implements IAnimal {
    String name;
    protected double valuer;
    protected double valuej;
    protected double values;

    @Override
    public boolean run(double distance) {
        return (distance <= valuer);
    }

    @Override
    public boolean jump(double height) {
        return (height <= valuej);
    }

    @Override
    public boolean swim(double meters) {
        return (meters <= values);
    }

    Animal(String name, double valuerC, double valuejC, double valuesC){
        valuer = valuerC;
        valuej = valuejC;
        values = valuesC;
        this.name = name;
    }

}
