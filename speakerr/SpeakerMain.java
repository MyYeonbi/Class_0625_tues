package speakerr;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker( "samsung");

        speaker.volumeUp();
        speaker.volumeDown();
        speaker.volumeUp();
        speaker.getVolume();
    }
}
