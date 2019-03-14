
/**
 * 
 */
import java.io.IOException;

import eu.tl1.tsio.message.WelcomeMessage;

/**
 * @author zengziwei
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WelcomeMessage msg = new WelcomeMessage(args);
		msg.display();
		 try { System.in.read(); } catch (IOException e) { e.printStackTrace(); }
		

	}

}
