package de.kernpunkt.test;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class Anschrift {

    private String Strasse;
    private int plz;
    private String stadt;

    public Anschrift(String strasse, int plz, String stadt) {
        Strasse = strasse;
        this.plz = plz;
        this.stadt = stadt;
    }

    @Override
    public String toString() {
        return "Anschrift{" +
                "Strasse='" + Strasse + '\'' +
                ", plz=" + plz +
                ", stadt='" + stadt + '\'' +
                '}';
    }
}
