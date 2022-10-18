import java.util.*;
public class sezar {

    public String metin="";
    public String sifreliMetin="";
    public String sifreCozulmusMetin="";

    public void metinAl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Metini giriniz");
        metin = sc.nextLine();
    }

    public void setSifreliMetinAl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Metini giriniz");
        sifreliMetin = sc.nextLine();
    }
    public void Sifrele(){

        char[] harfler=metin.toCharArray();
        String sifreli="";
        for (int i = 0; i < harfler.length; i++) {
            int oteleme = 0;
            if( !(harfler[i] >= 'a' && harfler[i] <= 'z' ) &&
                    !(harfler[i] >= 'A' && harfler[i] <= 'Z') &&
                    !(harfler[i] >= '0' && harfler[i] <= '9')) {
                sifreli += harfler[i];
            } else if (harfler[i] >= 'a' && harfler[i] <= 'z' ) {
                while(oteleme != 7){
                    harfler[i] = (char) (harfler[i] + 1);
                    if(harfler[i] == '{') harfler[i] = 'a';
                    oteleme++;
                }
                sifreli += harfler[i];
            } else if (harfler[i] >= 'A' && harfler[i] <= 'Z') {
                while(oteleme != 7) {
                    harfler[i] = (char) (harfler[i] + 1);
                    if(harfler[i] == '[') harfler[i] = 'A';
                    oteleme++;
                }
                sifreli += harfler[i];
            } else if(harfler[i] >= '0' && harfler[i] <= '9') {
                while(oteleme != 7) {
                    harfler[i] = (char) (harfler[i] + 1);
                    if(harfler[i] == ':') harfler[i] = '0';
                    oteleme++;
                }
                sifreli += harfler[i];
            }
        }
        System.out.println(sifreli);
    }

    public void sifreyiCoz(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sifreli metini giriniz");
        sifreliMetin=sc.nextLine();
        char[] harfler = sifreliMetin.toCharArray();

        for (int i = 0; i < harfler.length; i++) {
            int oteleme = 0;
            if( !(harfler[i] >= 'a' && harfler[i] <= 'z' ) &&
                    !(harfler[i] >= 'A' && harfler[i] <= 'Z') &&
                    !(harfler[i] >= '0' && harfler[i] <= '9')) {
            } else if (harfler[i] >= 'a' && harfler[i] <= 'z' ) {
                while(oteleme != 7){
                    harfler[i] = (char) (harfler[i] - 1);
                    if(harfler[i] == '`') harfler[i] = 'z';
                    oteleme++;
                }
            } else if (harfler[i] >= 'A' && harfler[i] <= 'Z') {
                while(oteleme != 7) {
                    harfler[i] = (char) (harfler[i] - 1);
                    if(harfler[i] == '@') harfler[i] = 'Z';
                    oteleme++;
                }
            } else if(harfler[i] >= '0' && harfler[i] <= '9') {
                while (oteleme != 7) {
                    harfler[i] = (char) (harfler[i] - 1);
                    if (harfler[i] == '/') harfler[i] = '9';
                    oteleme++;
                }
            }
            sifreCozulmusMetin += harfler[i];
        }
        System.out.println("Sifresi Cozolmus metin: " +sifreCozulmusMetin);
    }
}
