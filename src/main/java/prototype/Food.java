package prototype;

public abstract class Food implements Cloneable{
    protected String name;

    public abstract void prepare();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
