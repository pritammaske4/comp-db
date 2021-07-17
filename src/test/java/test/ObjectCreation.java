package test;

import com.herokuapp.automation.pages.BasePage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation implements Cloneable{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, CloneNotSupportedException, NoSuchMethodException {
        ObjectCreation obj1= new ObjectCreation();
        ObjectCreation obj2= ObjectCreation.class.newInstance();
        Constructor<ObjectCreation> constructor =  ObjectCreation.class.getConstructor();
        ObjectCreation obj3= constructor.newInstance();

        ObjectCreation ob4 =(ObjectCreation) obj3.clone();

    }


    public <T extends AbstractClassExample>T getInstance(Class<T> clazz ) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        T obj=null;
        final Constructor<T> cons = (Constructor<T>) clazz.getDeclaredConstructors()[0];
        cons.setAccessible(true);
        obj = cons.newInstance();
        return obj;
    }

    public void acceptInstance(Object object){

        if (object instanceof ArrayElement){
            object = new ArrayElement();
        }

        if (object instanceof MultiDimeList){
            object= new MultiDimeList();
        }

    }
}
