
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.commonbehavior;

public class Trigger extends uml.commonstructure.NamedElement {

	public uml.commonbehavior.Event event = null;
	public uml.structuredclassifiers.PortList port = new uml.structuredclassifiers.PortList(); // PSCS-specific

	public void setEvent(uml.commonbehavior.Event event) {
		this.event = event;
	} // setEvent
	
    public void addPort(uml.structuredclassifiers.Port port) // PSCS-specific
    {
        this.port.add(port);
    }

} // Trigger
