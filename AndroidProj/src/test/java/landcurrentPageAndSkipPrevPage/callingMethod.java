package landcurrentPageAndSkipPrevPage;


import basicWorkflowWithBasicConcepts.baseClass;
import clipBoardTextDemo.clipBoardTextSample;

public class callingMethod  extends baseClass {

	public callingMethod() {
		super();
	}

	public static void main(String[] args) throws Exception {
		
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		
		landCurrentPage keyword = new landCurrentPage();
		//keyword.firstScreen_preferences();
		//keyword.preferences_dependencies();
		keyword.preferences_wifi_tickCheckBox();
		keyword.preferences_wifi_SettingsTap();
		keyword.preferences_wifi_Settings_getText(); //getText
		keyword.preferences_wifi_settings_clipBoard_and_Hit_Enter();
		keyword.preferences_wifi_settings_giveInputs_thenClickOKButton(); 
		keyword.clickBackAndGoBackToHomeScreen();
				
	}

}
