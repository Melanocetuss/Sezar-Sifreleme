import java.util.*;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sezar s = new sezar();


        boolean cikis = true;
        while (cikis){
            MENU();
            int secim = sc.nextInt();
            switch (secim){
                case 1:
                    s.metinAl();
                    break;

                case 2:
                    s. Sifrele();
                    break;

                case 3:
                    s.sifreyiCoz();
                    break;

                case 4:
                    cikis=false;
                    break;
            }
        }
    }
    public static void MENU(){
        System.out.println("---| Menu |---");
        System.out.println("---| 1)Metin gir");
        System.out.println("---| 2)Sifrele");
        System.out.println("---| 3)Sifre Coz");
        System.out.println("---| 4)Cikis");
    }

}
