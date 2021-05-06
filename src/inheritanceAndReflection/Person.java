package inheritanceAndReflection;

public abstract class Person { // абстрактный класс
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
    public abstract int getId();
}
