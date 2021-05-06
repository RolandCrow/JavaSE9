package inheritanceAndReflection;

public abstract class Student extends Person implements Named{
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
