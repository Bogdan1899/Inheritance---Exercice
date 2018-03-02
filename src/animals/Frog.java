package animals;

public class Frog extends Animal{

    private static final String KIND = "Frog";

    public Frog(String name, int age, String gender) {
        super(KIND, name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Frogggg";
    }
}
