package abstractFactory;

public class SamsungPhone extends Phone{
    @Override
    public void makeCall() {
        System.out.println("Making a call with Samsung phone!!!");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message with Samsung phone!!!");
    }
}

