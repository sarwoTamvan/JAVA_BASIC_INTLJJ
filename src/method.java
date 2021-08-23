
import java.util.*;


public class method {
    public static void main(String  [] args){
        System.out.println("hello world");

        Scanner input= new Scanner(System.in);
        System.out.println("masukkan nilai panjang= ");
        int panjang= input.nextInt();
        System.out.println("masukan nilai lebar= ");
        int lebar=input.nextInt();
        int luas=(panjang*lebar);
        System.out.print("\n");
        System.out.println("ini adalah hasil luas " +
                luas);
System.out.println("ini hasil perkalian "+perkalian(panjang,lebar));


    }
    private static int perkalian(int panjang,int lebar){
        int hasilKali=panjang*lebar;
        return hasilKali;
    }
}
// pemrograman menggunakan method sangat asik,aplagi bisa dibikin kompleks