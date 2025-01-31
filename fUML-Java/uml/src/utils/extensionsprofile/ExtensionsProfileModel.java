package utils.extensionsprofile;

import uml.packages.Profile;
import uml.packages.Stereotype;
import utils.environment.InMemoryModel;

public class ExtensionsProfileModel extends InMemoryModel {

    private static ExtensionsProfileModel instance;

    public Profile Profile_ExtensionsProfile = new Profile();
    public Stereotype Stereotype_ExplicitBaseClassCall = new Stereotype();

    public static ExtensionsProfileModel instance()
    {
        if (instance == null)
        {
            instance = new ExtensionsProfileModel();
            instance.initializeInMemoryModel();
        }

        return instance;
    }

    private void initializeInMemoryModel()
    {
        /*
		 * Create in-memory model elements
		 */
        Profile_ExtensionsProfile.setName("ExtensionsProfile");
        Stereotype_ExplicitBaseClassCall.setName("ExplicitBaseClassCall");
        Stereotype_ExplicitBaseClassCall._setProfile(Profile_ExtensionsProfile);
    }
} // ExtensionsProfileModel
