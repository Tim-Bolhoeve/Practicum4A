public class Persoon {
    String naam;
    int leeftijd;

    public Persoon(String nm, int lft){
        this.naam = nm;
        this.leeftijd = lft;
    }
    public String toString(){
        return naam + ";" + " leeftijd " + leeftijd + " jaar";
    }
}
