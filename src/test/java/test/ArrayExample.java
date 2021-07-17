package test;

public class ArrayExample {
    public static void main(String[] args) {
        int array[];
        array=new int[]{5,10,7,2,8};

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for (int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
}
