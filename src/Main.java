import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElementoMultimediale[] array = new ElementoMultimediale[5];
        Immagine img = new Immagine("Immagine 1", 3);
        array[0] = img;
        Video video = new Video("Video 1", 10, 5, 0);
        array[1] = video;
       Audio audio = new Audio("Audio 1", 15, 7);
        array[2] = audio;
        for (int i = 3; i < array.length; i++) {
            System.out.println("Inserisci il tipo di oggetto (1 = Audio, 2 = Video, 3 = Immagine):");
            int tipo = input.nextInt();
            input.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = input.nextLine();

            System.out.println("Inserisci la durata:");
            int durata = input.nextInt();
            input.nextLine();

            if (tipo == 1) {
                System.out.println("Inserisci il volume:");
                input.nextLine();

                Audio audio1 = new Audio("Audio 1", 15, 7);
                array[i] = audio1;
            } else if (tipo == 2) {
                System.out.println("Inserisci il volume:");
                int volume = input.nextInt();
                input.nextLine();

                System.out.println("Inserisci la luminosità:");
                int luminosita = input.nextInt();
                input.nextLine();

                Video video1 = new Video(titolo, durata, volume, luminosita);
                array[i] = video1;
            } else if (tipo == 3) {
                System.out.println("Inserisci la luminosità:");
                int luminosita = input.nextInt();
                input.nextLine();

                Immagine immagine = new Immagine(titolo, luminosita);
                array[i] = immagine;
            } else {
                System.out.println("Tipo non valido. Riprova.");
                i--;
            }
        }

        int scelta;
        do {
            System.out.println("Quale oggetto vuoi riprodurre? (1-5, 0 per uscire)");
            scelta = input.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale oggetto = array[scelta - 1];
                if (oggetto instanceof Audio) {
                    Audio audio1 = (Audio) oggetto;
                    audio1.play();
                } else if (oggetto instanceof Video) {
                    Video video1 = (Video) oggetto;
                    video1.play();
                } else if (oggetto instanceof Immagine) {
                    Immagine immagine = (Immagine) oggetto;
                    immagine.show();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);
        input.close();
    }
    
}
