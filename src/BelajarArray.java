import java.util.Arrays;



public class BelajarArray {

    public static void main(String[]args){
        int[] arrayInteger={1,2,3,4,5,6,7,8,9};
        float[] arrayFloat={5,6,7,8,9,};
        System.out.println(arrayInteger[5]); //ini cara pemanggilan index array di java
        arrayFloat[3]=10.890f;
        System.out.println(Arrays.toString(arrayFloat));
    }
}
