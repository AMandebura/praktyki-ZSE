package zadanie1;

public class uczen {
    String imie, nazwisko;
    int wiek;

    public void setInfo(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public void Info(String imie,String nazwisko,int wiek) {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(wiek);
    }
}