package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	
		public static void main(String[] args) {
		
		Logger log =LogManager.getLogger(Demo.class.getName());
		
		log.info("This is for: -Opertation successfully completed");
		log.info("This is for: -After Loading Page or any sucessful validations");
						
		log.debug("This is for: -Action/Operation performed");
		log.debug("This is for: -Like SendKeys, Gettext");
						
		log.error("This is for: -Validation fails- WebElemnets not displayed");
		
		log.fatal("This is for: -Application is not able to connect to a crucial data store like a database");
		
	}

}
