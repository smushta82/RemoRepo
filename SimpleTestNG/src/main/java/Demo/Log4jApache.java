package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jApache {
	
	private static Logger log = LogManager.getLogger(Log4jApache.class);

	public static void main(String[] args) {
		
		System.out.println("This is Trace..!");
		log.trace("This is Trace");
		
	}

}
