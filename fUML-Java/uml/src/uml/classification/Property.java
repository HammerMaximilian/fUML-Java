
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

package uml.classification;

import uml.commonstructure.ConnectableElement;
import uml.simpleclassifiers.Interface;

public class Property extends uml.classification.StructuralFeature {

	public ConnectableElement connectableElement = new ConnectableElement(); // PSCS-specific ; NOTE: class ConnectableElement can not be abstract here
	public boolean isDerived = false;
	public boolean isReadOnly = false;
	public boolean isDerivedUnion = false;
	public uml.classification.AggregationKind aggregation = uml.classification.AggregationKind.none;
	public boolean isComposite = false;
	public uml.structuredclassifiers.Association owningAssociation = null;
	public uml.simpleclassifiers.DataType datatype = null;
	public uml.structuredclassifiers.Association association = null;
	public uml.structuredclassifiers.Class_ class_ = null;
	public uml.classification.Property opposite = null;
	public uml.values.ValueSpecification defaultValue = null;
	public boolean isID = false;
	public Interface interface_ = null; // PSCS-specific

	public void setIsReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	} // setIsReadOnly

	public void setAggregation(
			uml.classification.AggregationKind aggregation) {
		this.aggregation = aggregation;
		this.isComposite = (aggregation == AggregationKind.composite);
	} // setAggregation

	public void _setAssociation(
			uml.structuredclassifiers.Association association) {
		this.association = association;
	} // _setAssociation

	public void _setClass(uml.structuredclassifiers.Class_ class_) {
		this.class_ = class_;
	} // _setClass

	public void _setDatatype(uml.simpleclassifiers.DataType datatype) {
		this.datatype = datatype;
	} // _setDataType
	
    public void _setInterface(Interface interface_) // PSCS-specific
    {
        this.interface_ = interface_;
        _setNamespace(interface_);
    }
    
    public void setDefaultValue(uml.values.ValueSpecification defaultValue)
    {
        this.defaultValue = defaultValue;
    } // SetDefaultValue

	public void setIsID(boolean isID) {
		this.isID = isID;
	} // setIsID

	public void _setOwningAssociation(
			uml.structuredclassifiers.Association association) {
		this.association = association;
	} // _setOwningAssociation

	public void _setOpposite(uml.classification.Property opposite) {
		this.opposite = opposite;
	} // _setOpposite

} // Property
