package dragAndDropDemo;

import basicWorkflowWithBasicConcepts.baseClass;

public class callingMethod {

	public static void main(String[] args) throws Exception {
		
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		
		dragDropSample dragDrop = new dragDropSample();
		dragDrop.views();
		dragDrop.dragOption();
		dragDrop.draggingFunc();
	}

}
