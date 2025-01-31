package utils.standardprofile;

import uml.packages.Profile;
import uml.packages.Stereotype;
import utils.environment.InMemoryModel;

public class StandardProfileModel extends InMemoryModel {

    private static StandardProfileModel instance;

    public Profile Profile_StandardProfile = new Profile();
    public Stereotype Stereotype_Create = new Stereotype(); // For PSCS, only stereotype "Create" is required

    public static StandardProfileModel Instance()
    {
        if (instance == null)
        {
            instance = new StandardProfileModel();
            instance.initializeInMemoryModel();
        }

        return instance;
    }

    private void initializeInMemoryModel()
    {
        /*
		 * Create in-memory model elements
		 */
        Profile_StandardProfile.setName("StandardProfile");
        Stereotype_Create.setName("Create");
        Stereotype_Create._setProfile(Profile_StandardProfile);
    }
} // StandardProfile
