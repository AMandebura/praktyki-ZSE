package Mechanik;

public class czlowiek {
    public class Human {
        protected String imie;
        protected char plec;
        protected String miejsce_zamieszkania;
        protected boolean czyzyje = true;
        protected String zarobek;
        protected int wiek;
        protected czlowiek[] rodzice;
        protected String Color_wlosow;
        protected boolean czy_lysy = true;
        static String gatunek = "homo sapiens";
        static String krolestwo = "saske";
        static String rzad = "nie wazne";
        static long liczba_ludzi = 7800000000l;
        static void nowy_czlowiek(){
            liczba_ludzi++;
        }
        void setColor_wlosow(String color){
            if(!czy_lysy){
                this.Color_wlosow = color;
            }
            else{
                System.out.println("przeciez jest łysy, lol");
            }
        }
        public void setRodzice(czlowiek matka, czlowiek ojciec){
            rodzice = new czlowiek[]{matka, ojciec};
        }
        public void setimie(String imie) {
            this.imie = imie;
        }
        public void setPlec(char plec) {
            this.plec = plec;
        }
        public void setmiejsce_zamieszkania(String miejsce_zamieszkania) {
            this.miejsce_zamieszkania = miejsce_zamieszkania;
        }
        public void setCzy_lysy(boolean czy_lysy) {
            this.czy_lysy = czy_lysy;
        }
        public void setWiek(int wiek) {
            this.wiek = wiek;
        }
        public char getPlec() {
            return plec;
        }
        public String imie() {
            return imie;
        }
        public String getmiejsce_zamieszkania() {
            return miejsce_zamieszkania;
        }
        public boolean isCzy_lysy() {
            return czy_lysy;
        }
        public String getColor_wlosow() {
            return Color_wlosow;
        }
        public int getWiek() {
            return wiek;
        }
        public czlowiek[] getRodzice() {
            return rodzice;
        }
        public Human(String imie, char plec, String miejsce_zamieszkania, boolean czy_lysy, String color_wlosow, int wiek, czlowiek[] rodzice) {
            this.imie = imie;
            this.plec = plec;
            this.miejsce_zamieszkania = miejsce_zamieszkania;
            this.czy_lysy = czy_lysy;
            this.Color_wlosow = Color_wlosow;
            this.wiek = wiek;
            this.rodzice = rodzice;
        }
    }}
