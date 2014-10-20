package cucumber.runtime.android;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * A wrapper class for ActivityInstrumentationTestCase2 which is an abstract class.
 *
 * @param <ACTIVITY>
 *            Activity class to invoke through a cucumber scenario.
 */
public class ActivityInstrumentationTestCase2Wrapper<ACTIVITY extends Activity> extends
        ActivityInstrumentationTestCase2 {

    public ActivityInstrumentationTestCase2Wrapper(Class<ACTIVITY> clazz) {
        super(clazz);
    }

    /**
     * setUp method uses protected modifier.
     */
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
}
