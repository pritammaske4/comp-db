package basic;

public class NPrime {
    public static void main(String[] args) {
        int num=38;
        boolean flag;
        num = num+1;
        for (int divider=2;divider<num;divider++){
            if (num%divider==0){
                flag=false;
                num=num+1;
                divider=2;
            }else{
                flag=true;
            }
            if(divider==(num)-1 && flag){
                System.out.println("Next : "+num);
                break;
            }

        }
    }
}
