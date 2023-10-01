package abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Создание фабрики для iPhone и создание самого iPhone
        PhoneFactory iPhoneFactory = new iPhoneFactory();
        Phone iPhone = iPhoneFactory.createPhone();
        iPhone.makeCall();
        iPhone.sendMessage();

        // Создание фабрики для Samsung phone и создание самого Samsung phone
        PhoneFactory samsungPhoneFactory = new SamsungPhoneFactory();
        Phone samsungPhone = samsungPhoneFactory.createPhone();
        samsungPhone.makeCall();
        samsungPhone.sendMessage();
    }

}