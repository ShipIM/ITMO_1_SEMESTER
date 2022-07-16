package Classes;

public abstract class BodyParts {
    protected String name;
    protected String condition;

    public BodyParts() {
    }

    @Override
    public String toString() {
        return name + " " + condition;
    }
}
