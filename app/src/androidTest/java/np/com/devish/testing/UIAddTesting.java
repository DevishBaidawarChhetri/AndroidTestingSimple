package np.com.devish.testing;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class UIAddTesting {
    @Rule
    public ActivityTestRule<MainActivity>
        testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkNos(){
        onView(withId(R.id.etFirstNumber))
                .perform(typeText("2"));
        onView(withId(R.id.etSecondNumber))
                .perform((typeText("34")));
        onView((withId(R.id.btnSum)))
                .perform(click());

        // This is another activity, no need to tell Espresso
        onView(withId(R.id.tvOutput))
                .check(matches(withText("46.0")));
    }
}