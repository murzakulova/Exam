public class Cat extends Pets {

    public Cat(String colour, int age, String name) {
        super(colour, age, name);
    }

    @Override
    public String toString() {
        return "Cat{}" + super.toString();
    }
}

