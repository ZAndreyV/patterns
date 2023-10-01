package abstractFactory;

public class SamsungPhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
