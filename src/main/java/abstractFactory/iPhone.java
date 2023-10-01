package abstractFactory;

public class iPhone extends Phone{
    @Override
    public void makeCall() {
        System.out.println("Making a call with iPhone!!!");
}
    @Override
    public void sendMessage() {
        System.out.println("Sending a message with iPhone!!!");
    }
}