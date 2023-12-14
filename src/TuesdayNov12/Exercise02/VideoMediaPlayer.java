package TuesdayNov12.Exercise02;

public class VideoMediaPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Can play video");
    }

    @Override
    public void pause() {
        System.out.println("Can pause music");
    }

    @Override
    public void fastForward() {
        System.out.println("Can fast forward music");
    }

    @Override
    public void rewind() {
        System.out.println("Can rewind music");
    }


}
