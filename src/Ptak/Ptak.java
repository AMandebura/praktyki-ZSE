package Ptak;
//konstruktor

    public class Ptak {
        String nazwa;
        String kolor;
        String gdzieWystepuje;

        boolean czyLata;

        public Ptak(){}

        public Ptak(String nazwa, String kolor, String gdzieWystepuje, boolean czyLata) {
            this.nazwa = nazwa;
            this.kolor=kolor;
            this.gdzieWystepuje =gdzieWystepuje;
            this.czyLata = czyLata;
            System.out.println("Ptak?");
        }

        public void setNazwa(String nazwa){
            this.nazwa = nazwa;
        }

        public void setKolor(String kolor){
            this.kolor = kolor;
        }

        public void setgdzieWystepuje(String gdzieWystepuje){
            this.gdzieWystepuje = gdzieWystepuje;
        }
        public void setczyLata(boolean czyLata){
            this.czyLata = czyLata;
        }

        public String getNazwa(){
            return this.nazwa;
        }

        public String getKolor() {
            return kolor;
        }

        public String getgdzieWystepuje() {
            return gdzieWystepuje;
        }
        public boolean czyLata() {
            return czyLata;
        }
    }

