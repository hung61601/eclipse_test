package idv.hung.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	IntegerOprand intA = new IntegerOprand(5);
    	IntegerOprand intB = new IntegerOprand(2);
    	
    	Multiplier m = new Multiplier();
    	m.multiply(intA, intB);
    	
        System.out.println( "Hello World!" );
    }
}
