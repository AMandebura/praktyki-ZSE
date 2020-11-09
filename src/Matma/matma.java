package Matma;
public class matma {
    double PI = 3.14;
    double e = 2.71;
    int x;
    int y;
    int z;
    void potega() {
        System.out.println("Liczba "+ x +" podniesiona do potegi 3 = " +x * x * x + "\n");
    }
    void liczbSumaIlocz() {
        System.out.println("Suma podanych liczb: x i y = " + (x + y) + "\n" + "\n" + "Różnica liczb: z i y = " +
                (z - y) + "\n" + "\n" + "Iloczyn liczb: x i z = " + (x * z) + "\n"+ "\n" );
    }
    void trojkatProstok() {
        if (x + y > z) {
            System.out.println("Wychodzi trójkąt prostokątny");
        }
        else {
            System.out.println("Nie Wychodzi trójkąt prostokątny");
        }
    }
}
