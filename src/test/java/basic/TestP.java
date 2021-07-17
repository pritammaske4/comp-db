package basic;



public class TestP {
    public static void main(String[] args)
    {
        try
        {
            badMethod();
            System.out.print("A");
        }
        catch (Throwable ex)
        {
            System.out.print("B");
        }
        finally
        {
            System.out.println("C");
        }
        System.out.print("D");
    }
    public static void badMethod()
    {
        throw new Error(); /* Line 22 */
    }

}
