public class Audio extends ElementoMultimediale {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }
@Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + ": " + "!".repeat(volume));
        }
    }
public void show() {
    // non fa nulla
}
}
