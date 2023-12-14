package TuesdayNov12.Exercise02;

public class MainMediaPlayer {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Apple Music Features");
        System.out.println("+++++++++++++++++++++++");
        AppleMusic appleMusic = new AppleMusic();
        appleMusic.play();
        appleMusic.pause();
        appleMusic.fastForward();
        appleMusic.rewind();
        appleMusic.limitedOnly(); //Unique Feature
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Amazon Music Features");
        System.out.println("+++++++++++++++++++++++");
        AmazonMusic amazonMusic = new AmazonMusic();
        amazonMusic.play();
        amazonMusic.pause();
        amazonMusic.fastForward();
        amazonMusic.rewind();
        amazonMusic.availableTo(); //Unique Feature
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Spotify Music Features");
        System.out.println("+++++++++++++++++++++++");
        Spotify spotify = new Spotify();
        spotify.play();
        spotify.pause();
        spotify.fastForward();
        spotify.rewind();
        spotify.paidVersion(); //Unique Feature
        System.out.println("++++++++++++++++++++");
        System.out.println("YouTube Features");
        System.out.println("++++++++++++++++++++");
        Youtube youtube = new Youtube();
        youtube.play();
        youtube.pause();
        youtube.fastForward();
        youtube.rewind();
        youtube.canSaveVideo(); //Unique Feature

    }
}
