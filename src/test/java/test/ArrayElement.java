package test;

public class ArrayElement {
    public static void main(String[] args) {
        int []arr = new int[]{55,48,48,45,91,97,45,1,39,54,36,6,19,35,66,36,72,93,38,21,65,70,36,63,39,76,82,26,67,29,24,82,62,53,1,50,47,65,67,19,66,90,77};

        int pCount=0;
        int nCount=0;
        int zCount=0;
        int arrLength=arr.length;

        for (int i=0;i<arrLength;i++){
            if(arr[i]>=-100 && arr[i]<=100){
                if (arr[i]>0){
                    pCount++;
                }else if(arr[i]<0){
                    nCount++;
                }else{
                    zCount++;
                }
            }

        }

        double result=0.0;
        if(pCount>0){
            result=(double) pCount/arrLength;
        }
        System.out.format("%.6f \n",result);
        result=0.0;

        if(nCount>0){
            result=(double) nCount/arrLength;
        }

        System.out.format("%.6f \n",result);
        result=0.0;

        if (zCount>0){
            result=(double)zCount/arrLength;
        }
        System.out.format("%.6f \n",result);
    }
}
