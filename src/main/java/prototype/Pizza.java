package prototype;

public class Pizza extends Food{
    public Pizza() {
        this.name = "Pizza";
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza.");
    }
}
