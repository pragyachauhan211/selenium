package longPressFunctionality;

import basicWorkflowWithBasicConcepts.baseClass;

public class callingMethod {

	public static void main(String[] args) throws Exception {
		
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		longPressFunc longPressFunc = new longPressFunc();
		longPressFunc.views();
		longPressFunc.expandableLists();
		longPressFunc.customAdaptor();
		longPressFunc.peopleNames();
	}

}
