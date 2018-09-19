package org.opencds.cqf.qdm.resources;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import org.hl7.fhir.dstu3.model.ResourceType;
import org.opencds.cqf.qdm.QdmBaseType;

@ResourceDef(name="PatientCharacteristicEthnicity", profile="TODO")
public class PatientCharacteristicEthnicity extends QdmBaseType {

    @Override
    public PatientCharacteristicEthnicity copy() {
        PatientCharacteristicEthnicity retVal = new PatientCharacteristicEthnicity();
        super.copyValues(retVal);

        return retVal;
    }

    @Override
    public ResourceType getResourceType() {
        return null;
    }

    @Override
    public String getResourceName() {
        return "PatientCharacteristicEthnicity";
    }

}
