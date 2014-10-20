package cucumber.runtime.android;

import junit.framework.TestCase;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;

/**
 * This class provides android instrumentation testing for cucumber steps. This invokes only one
 * activity through a cucumber scenario and you will then be able to manipulate your Activity
 * directly. 
 * </p> Other options supported by this test case include:
 * <ul>
 * <li>You can run any test method on the UI thread (see {@link android.test.UiThreadTest}).</li>
 * <li>You can inject custom Intents into your Activity (see {@link #setActivityIntent(Intent)}).</li>
 * </ul>
 */
public class ActivityInstrumentationSteps extends TestCase {

    /**
     * Wrapper for abstract class ActivityInstrumentationTestCase2 which is initialized only once
     * during the one whole scenario through the steps classes.
     */
    private static ActivityInstrumentationTestCase2Wrapper mWrapper;

    public ActivityInstrumentationSteps(Class<?> clazz) {
        if(mWrapper == null) {
            mWrapper = new ActivityInstrumentationTestCase2Wrapper(clazz);
        }
    }

    public void setUp() throws Exception {
        mWrapper.setUp();
    }

    public void tearDown() throws Exception {
        mWrapper.tearDown();
        mWrapper = null;
    }

    @SuppressWarnings("deprecation")
    public void injectInstrumentation(Instrumentation instrumentation) {
        mWrapper.injectInsrumentation(instrumentation);
    }

    public Instrumentation getInstrumentation() {
        return mWrapper.getInstrumentation();
    }

    public void setActivityIntent(Intent intent) {
        mWrapper.setActivityIntent(intent);
    }

    public void setActivityInitialTouchMode(boolean initialTouchMode) {
        mWrapper.setActivityInitialTouchMode(initialTouchMode);
    }

    public Activity getActivity() {
        return mWrapper.getActivity();
    }
}
