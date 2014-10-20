package cucumber.example.android.cukeulator.test;

import android.app.Activity;
import android.widget.TextView;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.example.android.cukeulator.R;
import static cucumber.example.android.cukeulator.test.Utils.clickOnView;

/**
 * Extra step definition class to demonstrate steps in one scenario through different classes.
 */
public class CalculatorExtraSteps extends TestSteps {

    @When("^I press ([+–x\\/=])$")
    public void I_press_op(char op) { 
        Activity activity = getActivity();

        switch (op) { 
            case '+':
                clickOnView(activity, R.id.btn_op_add);
                break;
            case '–':
                clickOnView(activity, R.id.btn_op_subtract);
                break;
            case 'x':
                clickOnView(activity, R.id.btn_op_multiply);
                break;
            case '/':
                clickOnView(activity, R.id.btn_op_divide);
                break;
            case '=':
                clickOnView(activity, R.id.btn_op_equals);
                break;
        }
    }

    @Then("^I should see (\\S+) on the display$")
    public void I_should_see_s_on_the_display(String s) {
        TextView display = (TextView) getActivity().findViewById(R.id.txt_calc_display);
        String displayed_result = display.getText().toString();
        assertEquals(s, displayed_result);
    }
}
