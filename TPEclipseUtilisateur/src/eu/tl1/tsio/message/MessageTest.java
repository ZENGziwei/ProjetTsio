package eu.tl1.tsio.message;

import junit.framework.TestCase;

public class MessageTest extends TestCase {
	public void testConstruction() {
	    String bonjour = "Bonjour";
	    WelcomeMessage msg = new WelcomeMessage(new String[] { bonjour });
	    msg.display();
	    assertSame(bonjour, msg.toString());
	  }

}
