package scrollDownUpDemo;

import basicWorkflowWithBasicConcepts.baseClass;

public class callingMethod {

	public static void main(String[] args) throws Exception {
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		
		scrollingDemo scrollingDemo = new scrollingDemo();
		// scrollingDemo.scrollUntilFindElement(); // one way to scroll
		scrollingDemo.scrollUntilBottomScreen(); // another way to scroll
	}

}
