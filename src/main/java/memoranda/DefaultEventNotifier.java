/**
 * DefaultEventNotifier.java Created on 10.03.2003, 21:18:02 Alex Package:
 * net.sf.memoranda
 * 
 * @author Alex V. Alishevskikh, alex@openmechanics.net Copyright (c) 2003
 *         Memoranda Team. http://memoranda.sf.net
 */
package main.java.memoranda;

import interfaces.IEvent;
import main.java.memoranda.ui.EventNotificationDialog;

/**
 *  
 */
/*$Id: DefaultEventNotifier.java,v 1.4 2004/01/30 12:17:41 alexeya Exp $*/
public class DefaultEventNotifier implements EventNotificationListener {

	/**
	 * Constructor for DefaultEventNotifier.
	 */
	public DefaultEventNotifier() {
		super();
	}

	/**
	 * @see main.java.memoranda.EventNotificationListener#eventIsOccured(interfaces.IEvent)
	 */
	public void eventIsOccured(IEvent ev) {		
		new EventNotificationDialog(
			"Memoranda event",
			ev.getTimeString(),
			ev.getText());
	}
	/**
	 * @see main.java.memoranda.EventNotificationListener#eventsChanged()
	 */
	
	////TASK 2-1 SMELL WITHIN A CLASS
	//this is a code smell because the method doesnt do anything
    //removed the method completely because it has no function
	//public void eventsChanged()
	//public void eventsChanged() {
		//
	//}

	
}
