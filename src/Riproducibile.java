public abstract class Riproducibile extends ElementoMultimediale {
    protected int volume;

    public Riproducibile(String titolo, int durata, int volume) {
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

    public abstract void play();
}
