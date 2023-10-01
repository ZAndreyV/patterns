package prototype;

public class Salad extends Food{
    public Salad() {
        this.name = "Salad";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing salad.");
    }
}
