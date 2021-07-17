package interviewpreparation;

public class Sample implements Cloneable{
    int a;
    int arr[]={1,2,3};

    public Sample(int a){
        System.out.println(a);
    }

    public Object clone() throws CloneNotSupportedException {
         return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Sample sample = new Sample(1);
        System.out.println(sample.hashCode());
        Sample sample1 = (Sample) sample.clone(); //shallow
        System.out.println(sample.hashCode());
    }
}
