public class Cow extends Pets {

    public Cow(String colour, int age, String name) {
        super(colour, age, name);
    }

    @Override
    public String toString() {
        return "Cow{}" + super.toString();
    }
}


