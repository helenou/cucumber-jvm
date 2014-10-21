package cucumber.example.android.cukeulator.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.example.android.cukeulator.CalculatorActivity;
import cucumber.example.android.cukeulator.R;
import cucumber.runtime.android.ActivityInstrumentationSteps;
import static cucumber.example.android.cukeulator.test.Utils.clickOnView;

/**
 * We extend ActivityInstrumentationSteps in order to have access to methods like getActivity and
 * getInstrumentation. Depending on what methods we are going to need, we can put our step
 * definitions inside classes extending any of the following Android test classes:
 * <p/>
 * ActivityInstrumentationSteps<br/>
 * ActivityInstrumentationTestCase2<br/>
 * InstrumentationTestCase<br/>
 * AndroidTestCase
 * <p/>
 * However we highly recommend to use ActivityInstrumentationSteps if you have steps in one scenario
 * through different classes.
 * <p/>
 * The CucumberOptions annotation is mandatory for exactly one of the classes in the test project.
 * Only the first annotated class that is found will be used, others are ignored. If no class is
 * annotated, an exception is thrown.
 * <p/>
 * The options need to at least specify features = "features". Features must be placed inside
 * assets/features/ of the test project (or a subdirectory thereof).
 */
@CucumberOptions(features = "features")
public class CalculatorSteps extends TestSteps {

    @Given("^I have a CalculatorActivity$")
    public void I_have_a_CalculatorActivity() {
        assertNotNull(getActivity());
    }

    @When("^I press (\\d)$")
    public void I_press_d(int d) {
        Activity activity = getActivity();

        switch (d) {
            case 0:
                clickOnView(activity, R.id.btn_d_0);
                break;
            case 1:
                clickOnView(activity, R.id.btn_d_1);
                break;
            case 2:
                clickOnView(activity, R.id.btn_d_2);
                break;
            case 3:
                clickOnView(activity, R.id.btn_d_3);
                break;
            case 4:
                clickOnView(activity, R.id.btn_d_4);
                break;
            case 5:
                clickOnView(activity, R.id.btn_d_5);
                break;
            case 6:
                clickOnView(activity, R.id.btn_d_6);
                break;
            case 7:
                clickOnView(activity, R.id.btn_d_7);
                break;
            case 8:
                clickOnView(activity, R.id.btn_d_8);
                break;
            case 9:
                clickOnView(activity, R.id.btn_d_9);
                break;
        }
    }
}
