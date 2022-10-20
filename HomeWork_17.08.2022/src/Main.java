public class Main {

    public static void main(String[] args) {
        MusicalInstrument[] instruments = {new Drum(12.1), new Guitar(7), new Trumpet(5.0)};
        for (MusicalInstrument instrument : instruments) {
            instrument.play();
        }
        System.out.println(MusicalInstrument.KEY);
    }

}
