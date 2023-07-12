package deviceRotationDemo;

import basicWorkflowWithBasicConcepts.Preferences;
import basicWorkflowWithBasicConcepts.baseClass;

public class callingMethod {

	public static void main(String[] args) throws Exception {
		
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		
		deviceRotationSample rotation = new deviceRotationSample();
		rotation.firstScreen_preferences();
		rotation.preferences_dependencies();
		//rotation.preferences_wifi_checkBox();
		rotation.rotateTheScreen();
		rotation.preferences_wifi_tickCheckBox();
		rotation.preferences_wifi_SettingsTap();
		rotation.preferences_wifi_Settings_getText(); //getText
		rotation.preferences_wifi_settings_giveInputs();
		rotation.preferences_wifi_settings_giveInputs_thenClickOK(); 
				
	}

}
