/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2017 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

public class Debug {
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_RED = "\u001B[31m";
    //private static Log log = LogFactory.getLog(Debug.class);
	
	public static final boolean DEBUG = true;
    
    public static void println(boolean condition, String message) {
    	if (condition) {
    		println(message);
    	}
    }

	public static void println(String message) {
		if(DEBUG)
		{
			if (message.length()>=7 && message.substring(0,7).equals("[event]")) {
				//log.info(message.substring(8,message.length()));
				// System.out.println(message.substring(8,message.length()));
				LOG_INFO(message);
			} else if (message.length()>=7 && message.substring(0,7).equals("[error]")) {
				//log.error(message.substring(8,message.length()));
				LOG_ERROR(message);
			} else {
				//log.debug(message);
				LOG_DEBUG(message);
			}
		}
	}
	
	private static void LOG_INFO(String message)
	{
		System.out.println("[" + ANSI_GREEN + "INFO" + ANSI_RESET + "]:\t\t\t" + message);
	}

	private static void LOG_DEBUG(String message)
	{
		System.out.println("[" + ANSI_BLUE + "DEBUG" + ANSI_RESET + "]:\t\t" + message);
	}
	
	private static void LOG_ERROR(String message)
	{
		System.out.println("[" + ANSI_RED + "ERROR" + ANSI_RESET + "]:\t\t" + message);
	}
}
