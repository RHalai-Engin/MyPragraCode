package TuesdayNov12.Exercise01;

import java.sql.SQLOutput;

public class SmartPhone {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("FEATURES OF SAMSUNG");
        System.out.println("********************");
        SamsungGalaxy samsungGalaxy = new SamsungGalaxy();
        samsungGalaxy.calculate();
        samsungGalaxy.makeCalls();
        samsungGalaxy.receiveCalls();
        samsungGalaxy.shootVideos();
        samsungGalaxy.takePictures();
        samsungGalaxy.surfInternet();
        System.out.println("********************");
        System.out.println("FEATURES OF IPHONE");
        System.out.println("********************");
        Iphone iphone = new Iphone();
        iphone.makeCalls();
        iphone.receiveCalls();
        iphone.shootVideos();
        iphone.takePictures();
        iphone.airdrop();
    }
}
