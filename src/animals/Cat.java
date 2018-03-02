package animals;

public class Cat extends Animal{

    private static final String KIND = "Cat";

    public Cat(String name, int age, String gender) {
        super(KIND, name, age, gender);
    }

    protected Cat(String kind, String name, int age, String gender){
        super(kind, name, age, gender);
    }

    @Override
    public String produceSound() {
        return "MiauMiau";
    }
}
