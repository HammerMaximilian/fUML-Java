package pscs.semantics.actions;

import fuml.semantics.actions.CreateLinkActionActivation;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;
import fuml.semantics.structuredclassifiers.ExtensionalValue;
import fuml.semantics.structuredclassifiers.ExtensionalValueList;
import fuml.semantics.structuredclassifiers.Link;
import pscs.semantics.structuredclassifiers.CS_Link;
import uml.actions.CreateLinkAction;
import uml.actions.LinkEndCreationData;
import uml.actions.LinkEndCreationDataList;
import uml.actions.LinkEndData;
import uml.structuredclassifiers.Association;

public class CS_CreateLinkActionActivation extends CreateLinkActionActivation {

	@Override
    public void doAction()
    {
        // Get the extent at the current execution locus of the association for
        // which a link is being created.
        // Destroy all links that have a value for any end for which
        // isReplaceAll is true.
        // Create a new link for the association, at the current locus, with the
        // given end data values,
        // inserted at the given insertAt position (for ordered ends).
        // fUML semantics is extended in the sense that a CS_Link is created instead of
        // a Link
        CreateLinkAction action = (CreateLinkAction)node;
        LinkEndCreationDataList endDataList = new LinkEndCreationDataList();
        for (LinkEndData data : action.endData)
        {
            endDataList.add((LinkEndCreationData)data);
        }
        Association linkAssociation = getAssociation();
        ExtensionalValueList extent = getExecutionLocus().getExtent(linkAssociation);
        boolean unique = false;
        for (LinkEndCreationData endData : endDataList)
        {
            if (endData.end.multiplicityElement.isUnique == false)
            {
                unique = true;
            }
        }
        for (ExtensionalValue value : extent)
        {
            Link link = (Link)value;
            boolean match = true;
            boolean destroy = false;
            int j = 1;
            while (j <= endDataList.size())
            {
                LinkEndCreationData endData = endDataList.get(j - 1);
                if (endMatchesEndData(link, endData))
                {
                    if (endData.isReplaceAll)
                    {
                        destroy = true;
                    }
                }
                else
                {
                    match = false;
                }
                j++;
            }
            if (destroy || (unique && match))
            {
                link.destroy();
            }
        }
        CS_Link newLink = new CS_Link();
        newLink.type = linkAssociation;
        for (LinkEndCreationData endData : endDataList)
        {
            int insertAt = 0;
            if (endData.insertAt != null)
            {
                insertAt = ((UnlimitedNaturalValue)takeTokens(endData.insertAt).get(0)).value.naturalValue;
            }
            newLink.setFeatureValue(endData.end, takeTokens(endData.value), insertAt);
        }
        newLink.addTo(getExecutionLocus());
    }
	
} // CS_CreateLinkActionActivation
