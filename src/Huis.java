public class Huis {
    String adres;
    int bouwjaar;
    public Persoon huisbaas;

    public Huis(String adr, int bwjr){
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" + "en heeft huisbaas" + huisbaas;
    }
}
