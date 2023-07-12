package clipBoardTextDemo;


import basicWorkflowWithBasicConcepts.baseClass;

public class callingMethod  extends baseClass {

	public callingMethod() {
		super();
	}

	public static void main(String[] args) throws Exception {
		
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		
		clipBoardTextSample clipBoard = new clipBoardTextSample();
		clipBoard.firstScreen_preferences();
		clipBoard.preferences_dependencies();
		clipBoard.preferences_wifi_tickCheckBox();
		clipBoard.preferences_wifi_SettingsTap();
		clipBoard.preferences_wifi_Settings_getText(); //getText
		clipBoard.preferences_wifi_settings_clipBoard();
		clipBoard.preferences_wifi_settings_giveInputs_thenClickOK(); 
	    
				
	}

}
