package cucumber.example.android.cukeulator.test;

import cucumber.example.android.cukeulator.CalculatorActivity;
import cucumber.runtime.android.ActivityInstrumentationSteps;

/**
 * A super class for Steps class for this test project. 
 * The passed Activity class is invoked through steps in one scenario.
 *
 */
public class TestSteps extends ActivityInstrumentationSteps {
	
    public TestSteps() {
    	super(CalculatorActivity.class);
	}

	public void setUp() throws Exception {
		super.setUp();
		
		// Add here the set up code for a scenario.
	}
	
	public void tearDown() throws Exception {
		// Add here the tear down code for a scenario.
		
		super.tearDown();
	}
}
