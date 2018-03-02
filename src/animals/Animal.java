package animals;

public abstract class Animal {

    private String kind;

    private String name;

    private int age;

    private String gender;

    public Animal(String kind, String name, int age, String gender) {
        this.setKind(kind);
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getKind() {
        return kind;
    }

    private void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String produceSound(){
        return "Not implemented!";
    }
}
