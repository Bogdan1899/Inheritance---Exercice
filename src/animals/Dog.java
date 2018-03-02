package animals;

public class Dog extends Animal{

    private static final String KIND = "Dog";

    public Dog(String name, int age, String gender) {
        super(KIND, name, age, gender);
    }

    @Override
    public String produceSound() {
        return "BauBau";
    }
}
