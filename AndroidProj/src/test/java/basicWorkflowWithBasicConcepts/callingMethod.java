package basicWorkflowWithBasicConcepts;

public class callingMethod {

	public static void main(String[] args) throws Exception {
		
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		Preferences flow = new Preferences();
		flow.firstScreen_preferences();
		flow.preferences_dependencies();
		flow.preferences_wifi_tickCheckBox();
		flow.preferences_wifi_SettingsTap();
		flow.preferences_wifi_Settings_getText(); //getText
		flow.preferences_wifi_settings_giveInputs();
		flow.preferences_wifi_settings_giveInputs_thenClickOK(); 
		       
	}

}
