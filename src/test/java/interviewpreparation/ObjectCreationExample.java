package interviewpreparation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ObjectCreationExample obj = new ObjectCreationExample();
        ObjectCreationExample obj1= ObjectCreationExample.class.newInstance();
        Constructor<ObjectCreationExample> constructor= ObjectCreationExample.class.getConstructor();
        ObjectCreationExample obj2=constructor.newInstance();
        //clone
        //serialization

    }
}
