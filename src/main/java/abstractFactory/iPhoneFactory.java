package abstractFactory;

public class iPhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone() {
        return new iPhone();
    }
}
