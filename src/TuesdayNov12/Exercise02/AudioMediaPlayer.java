package TuesdayNov12.Exercise02;

public class AudioMediaPlayer implements MediaPlayer{

    @Override
    public void play() {
        System.out.println("Can play music");
    }

    @Override
    public void pause() {
        System.out.println("Can pause music");
    }

    @Override
    public void fastForward() {
        System.out.println("Can skip/fast forward music");
    }

    @Override
    public void rewind() {
        System.out.println("Can rewind music");
    }
}
