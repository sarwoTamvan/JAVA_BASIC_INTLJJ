import java.util.Arrays;



public class BelajarArray {

    public static void main(String[]args){
        int[] arrayInteger={1,2,3,4,5,6,7,8,9};
        float[] arrayFloat={5,6,7,8,9,};
        System.out.println(arrayInteger[5]); //ini cara pemanggilan index array di java
        arrayFloat[3]=10.890f;
        System.out.println(Arrays.toString(arrayFloat));
        // cara memanggil array menjadi string
        System.out.println("====== ini adalah pemanggilan array to string=====");
        System.out.println(Arrays.toString(arrayInteger));
        satu(arrayInteger);
        System.out.println("mengkopi array dengan copyOf");
        int [] arrayInteger2= Arrays.copyOf(arrayInteger,5);
        satu(arrayInteger);  // ingat cara pemanggilanya menggunakan fungsi yangdibuat (contohnya fungsi satu)
        satu(arrayInteger2);
        System.out.println(" mengkopy array menggunakan copyOfRange");
        int[] arrayInteger4=Arrays.copyOfRange(arrayInteger,3,5);
       satu(arrayInteger);
        satu(arrayInteger4);
        System.out.println("fill array adalah apabila kita ingin membuat data array tapi isinya sama semua");
    int[] arrayInteger5= new int[10];
        System.out.println(arrayInteger5);
        System.out.println(arrayInteger5[8]);
        satu(arrayInteger5);
        Arrays.fill(arrayInteger5,1);//nih dua cara memanggil fill
        satu(arrayInteger5);              // di panggil fill dulu baru panggil fungsi,trus diisi parameternya
        System.out.println("membadingkan data array harus menngunakan equals");
int[] arrayInteger6={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger7={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.equals(arrayInteger6,arrayInteger7));
        int[] arrayInteger8={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger9={1,2,3,4,5,6,88,8,9};
        System.out.println(Arrays.equals(arrayInteger8,arrayInteger9));
        System.out.println("membandingkan menggunakan if");
if (Arrays.equals(
        arrayInteger6,arrayInteger7
)){
    System.out.println("hasilnya sama broh");
}else {
    System.out.println("hasilnya beda broh");
}
        if (Arrays.equals(
                arrayInteger8,arrayInteger9
        )){
            System.out.println("hasilnya sama broh");
        }else {
            System.out.println("hasilnya beda broh");
        }
        System.out.println("cara mengecek nilai mana yang lebih besar menggunakan compare");
        int[] arrayInteger12={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger13={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger14={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger15={1,2,99,4,5,6,7,8,9};
        System.out.println("inti dari compare adalah jika 0 maka semuanya sama, jiaka 1 maka array pertama lebih besar" +
                "jika -1 maka array ke2 lebih besar");
        System.out.println(Arrays.compare(arrayInteger12,arrayInteger13));
        System.out.println(Arrays.compare(arrayInteger14,arrayInteger15));

        System.out.println("cara mengecek index mana yg berbeda yaitu menggunakan mismatch");
        int[] arrayInteger10={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger11={1,2,3,4,5,6,7,8,9};
        int[] arrayInteger16={1,2,3,4,78,6,7,8,9};
        int[] arrayInteger17={1,88,3,4,5,6,7,8,9};

        System.out.println(Arrays.mismatch(arrayInteger10,arrayInteger11 ));
        System.out.println(Arrays.mismatch(arrayInteger16,arrayInteger17 ));
        System.out.println("inti dari penggunakan mismatch adalah jika semua data array sama maka dia akan -1" +
                "namun jika ada perbedaan maka dia akan mengecek idex mana yang lebih dulu berbeda");






    }
    private static void   satu(int[] dataArray){ // untuk lebih simple buat fungsi seperti ini,agar mudsh di debug
        System.out.println(Arrays.toString(dataArray));
    }
}
