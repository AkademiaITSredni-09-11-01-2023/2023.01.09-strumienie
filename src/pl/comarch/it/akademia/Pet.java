package pl.comarch.it.akademia;

public class Pet {
    public String name;
    int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }

    public void szekaj() {
        System.out.println("hau hau !!!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
