package TuesdayNov12.Exercise01;

public class Iphone extends FileTransfer implements Calculator, Camera, Computer, Telephone{

    @Override
    public void calculate() {

    }

    @Override
    public void takePictures() {
        System.out.println("IPhone can take pictures using 3 cameras");
    }

    @Override
    public void shootVideos() {
        System.out.println("Shoot videos in cinematic mode");
    }

    @Override
    public void surfInternet() {
    }

    @Override
    public void makeCalls() {
        System.out.println("Make calls using siri");
    }

    @Override
    public void receiveCalls() {

    }
}
