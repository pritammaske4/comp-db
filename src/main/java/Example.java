import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws IOException {
        System.out.println(1/'a');
        WebElement element = null;
        WebDriver driver = null;
        driver.switchTo().frame(element);
        driver.findElement(By.xpath(""));


        TakesScreenshot tk = (TakesScreenshot)driver;
        File  file=tk.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(""));

    }

    public static class ObjectCreation {
        public void display(){
            System.out.println("inside display");
        }
        public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            ObjectCreation o1= new ObjectCreation() ;
            ObjectCreation o2= ObjectCreation.class.newInstance();
            Constructor<ObjectCreation> constructor= ObjectCreation.class.getConstructor();
            ObjectCreation o3= constructor.newInstance();
            o3.display();
        }
    }
}
