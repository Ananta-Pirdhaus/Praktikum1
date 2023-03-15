
import java.util.Objects;
import java.util.Scanner;

/**
 * @author ${USER}
 * @created ${DAY}/${MONTH}/${YEAR} - ${TIME}
 * @project ${PROJECT_NAME}
 */
public class Segitiga<T extends Number>{
        T alas;
        T tinggi;
    public Segitiga(T alas, T tinggi){
        this.alas = alas;
        this.tinggi  = tinggi;
    }
    int getResultAsInt(){
        int a = alas.intValue();
        int t = tinggi.intValue();
        return (int) (0.5*a*t);
    }
    double getResultAsDouble(){
        double a = (double) alas;
        double t = (double) tinggi;
        return (0.5*a*t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner lup = new Scanner(System.in);
        for(String Loop = "Y"; Objects.equals(Loop, "Y"); Loop = lup.nextLine()) {
            System.out.println("=====Hitung Luas Segitiga====");
            System.out.println("Mau Hasil dalam bentuk apa sayang? ");
            System.out.println("1. Hasil dalam Bentuk Integer: ");
            System.out.println("2. Hasil dalam Bentuk Double: ");
            System.out.println("Masukkan Pilihan (1/2): ");
            int pilihan = sc.nextInt();
            System.out.print("Masukkan Nilai Alas dan Tinggi: ");
            String[] yow = sc.next().split(",");
            switch (pilihan) {
                case 1 -> {
                    try {
                        Segitiga<Integer> luasTipeInt = new Segitiga<>(Integer.parseInt(yow[0]), Integer.parseInt(yow[1]));
                        System.out.println("Luas Segitiga dalam Integer: " + luasTipeInt.getResultAsInt());
                        System.out.print("Apakah anda ingin mengulangnya manizzz? [Y/n] : ");
                    }catch (Exception e){
                        System.out.println(e+ "ANGKA MOAZZZZZZZZ");
                    }
                }
                case 2 -> {
                    try {
                        Segitiga<Double> luasTipeDouble = new Segitiga<>(Double.parseDouble(yow[0]), Double.parseDouble(yow[1]));
                        System.out.println("Luas Segitiga dalam Double: " + luasTipeDouble.getResultAsDouble());
                        System.out.print("Apakah anda ingin mengulangnya manizzz? [Y/n] : ");
                    }catch (Exception e){
                        System.out.println("KUDU ANGKA MOAZZZZ"+e);
                    }
                }
                default -> System.out.println("MATAMU GOBLOK");
            }

        }
    }
}