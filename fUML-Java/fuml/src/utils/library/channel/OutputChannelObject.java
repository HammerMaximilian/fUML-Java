/*
 * Copyright 2008 Lockheed Martin Corporation, except as stated in the file 
 * entitled Licensing-Information. 
 * All modifications copyright 2009-2011 Data Access Technologies, Inc. 
 * Licensed under the Academic Free License 
 * version 3.0 (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package utils.library.channel;

import utils.library.FoundationalModelLibraryModel;
import utils.library.common.Status;
import utils.library.libraryclass.OperationExecution;

import fuml.semantics.simpleclassifiers.BooleanValue;

public abstract class OutputChannelObject extends ChannelObject {

	public OutputChannelObject()
	{
		types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_OutputChannel);
	}
	
    public abstract void write(fuml.semantics.values.Value value, Status errorStatus);
    public abstract boolean isFull();

    public void execute(OperationExecution execution) {
        String name = execution.getOperationName();

        if (name.equals("write")) {
        	Status status = new Status(this.locus, "OutputChannelObject");
            this.write(execution.getParameterValue("value").values.getValue(0), status);
            this.updateStatus(execution, status);
        } else if (name.equals("isFull")) {
            BooleanValue isFullValue = new BooleanValue();
            isFullValue.value = this.isFull();
            isFullValue.type = this.locus.factory.getBuiltInType("Boolean");
            execution.setReturnParameterValue(isFullValue);
        } else {
            super.execute(execution);
        }

    }

} // OutputChannelObject
