/**
 * 
 */
package eu.tl1.tsio.message;

/**
 * @author zengziwei
 *
 */
public class WelcomeMessage {
	private String[] dest;
    /**
     * @param args Message destination
     */
    public WelcomeMessage(String[] args) {
            dest = args;
    }
    /**
     * Display the message.
     */
    public void display() {
    	    String to = dest[0];
            display(dest[0]);
    }
    /**
     * Display the specified message.
     */
    public void display(String to) {
            System.out.printf("Hello %s !", to);
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
 
}
