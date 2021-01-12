package Problema1;

public class Land {
    private String Name;
    private String Kontinent;
    private long Flache;
    private long Bevolkerung;
    private String Hauptstadt;

    public Land(String name, String kontinent, long flache, long bevolkerung, String hauptstadt) {
        Name = name;
        Kontinent = kontinent;
        Flache = flache;
        Bevolkerung = bevolkerung;
        Hauptstadt = hauptstadt;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getKontinent() {
        return Kontinent;
    }

    public void setKontinent(String kontinent) {
        Kontinent = kontinent;
    }

    public long getFlache() {
        return Flache;
    }

    public void setFlache(long flache) {
        Flache = flache;
    }

    public long getBevolkerung() {
        return Bevolkerung;
    }

    public void setBevolkerung(long bevolkerung) {
        Bevolkerung = bevolkerung;
    }

    public String getHauptstadt() {
        return Hauptstadt;
    }

    public void setHauptstadt(String hauptstadt) {
        Hauptstadt = hauptstadt;
    }

    @Override
    public String toString() {
        return "Land{" +
                "Name='" + Name + '\'' +
                ", Kontinent='" + Kontinent + '\'' +
                ", Flache=" + Flache +
                ", Bevolkerung=" + Bevolkerung +
                ", Hauptstadt='" + Hauptstadt + '\'' +
                '}';
    }
}
