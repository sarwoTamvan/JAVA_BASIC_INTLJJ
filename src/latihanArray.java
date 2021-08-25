import java.util.Arrays;

public class latihanArray {
    public static void main(String[] args) {
                int [] arraySatu={1,4,2,4,5,6,7,8,9,23};
    int[] arrayDua={3,4,2,1,5,7,98,78,9,33};
    int [] arrayHasil= new  int[arraySatu.length];
                for (int i=0; i < arraySatu.length;i++){
                    arrayHasil[i]=arraySatu[i] + arrayDua[i];
                }
        System.out.println(arraySatu);
                hasil(arraySatu,"ini dia ");
                hasil(arraySatu,"ini data asli arraySatu");
                hasil(arrayHasil,"ini hasil penjumlahan array");
    }
    private static void hasil(int []nilai,String mesage){  //jika kita menambahkan parameter didalam colection maka
        System.out.println(mesage +Arrays.toString(nilai)); //kita menginisialisasinya disii,kemudian panggil diatas
    }
}
