import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4jTest {

	static Logger log = LogManager.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		if (args.length > 0) {
			log.error("ARGS: " + args[0]);
		}
	}

}
