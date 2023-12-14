package TuesdayNov12.Exercise01;

public class SamsungGalaxy implements Calculator, Camera, Telephone, Computer{
    @Override
    public void calculate() {
        System.out.println("SamsungGalaxy is Calculating");
    }

    @Override
    public void takePictures() {
        System.out.println("SamsungGalaxy can take pictures at 50MP");

    }

    @Override
    public void shootVideos() {
        System.out.println("Videos shot at 100x zoom");
    }

    @Override
    public void surfInternet() {
        System.out.println("Samsung supports 3rd party from internet");
    }

    @Override
    public void makeCalls() {
        System.out.println("User google AI to make calls");
    }

    @Override
    public void receiveCalls() {
        System.out.println("Slide to receive calls");
    }
}
