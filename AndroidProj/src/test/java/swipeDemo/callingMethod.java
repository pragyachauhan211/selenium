package swipeDemo;

import basicWorkflowWithBasicConcepts.baseClass;

public class callingMethod {

	public static void main(String[] args) throws Exception {
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		
		swipeSample scrollingDemo = new swipeSample();
		scrollingDemo.views();
		scrollingDemo.gallery();
		scrollingDemo.photos();
		scrollingDemo.swipeToLeft();
	}

}
