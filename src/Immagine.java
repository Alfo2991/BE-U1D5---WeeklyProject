
public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }
@Override
    public void show() {
        System.out.println(getTitolo() + ": " + "*".repeat(luminosita));
    }
    public void play() {
        // non fa nulla
    }
}
