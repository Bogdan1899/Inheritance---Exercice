package animals;

public class Kitten extends Cat{

    private static final String KIND = "Kitten";

    public Kitten(String name, int age, String gender) {
        super(KIND, name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Miau";
    }
}
