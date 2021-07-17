import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CloneExample implements Cloneable{

    protected Object clone()throws CloneNotSupportedException{
       return super.clone();
    }

    private void display(){
        System.out.println("Inside Display");
    }


    public static void main(String[] args) throws InstantiationException,IllegalAccessException , NoSuchMethodException, InvocationTargetException {
        CloneExample cloneExample = new CloneExample(); //new keyword
        CloneExample obj = null;
        try {
            obj=(CloneExample)cloneExample.clone(); //clone method
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        cloneExample.display();
        obj.display();

        CloneExample c1 = CloneExample.class.newInstance(); //newInstall of Class class
        Constructor<CloneExample> constructor = CloneExample.class.getConstructor();
        CloneExample c2= constructor.newInstance(); // newInstance of Constructor class
    }

}
