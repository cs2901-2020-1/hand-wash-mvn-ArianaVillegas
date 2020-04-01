package cs_utec.cs2901;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        for(int i=0; i<100; i++){
            logger.info("Me debo lavar las manos por 20 segundos.");
        }
    }
}
