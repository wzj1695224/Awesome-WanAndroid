package json.chao.com.wanandroid.ui;

import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.IdlingResource;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import json.chao.com.wanandroid.BasePageTest;
import json.chao.com.wanandroid.R;
import json.chao.com.wanandroid.ui.main.activity.MainActivity;



@RunWith(AndroidJUnit4.class)
@LargeTest
public class UsagePageTest extends BasePageTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    private IdlingResource mCountingIdlingResource;

    @Before
    public void setUp() {
        mCountingIdlingResource = mActivityTestRule.getActivity().getCountingIdlingResource();
    }

    @After
    public void testFinish() {
        IdlingRegistry.getInstance().unregister(mCountingIdlingResource);
    }

    @Test
    public void clickUsagePage() {
        clickView(R.id.action_usage);

        checkVisible(R.id.usage_scroll_view);
    }

    @Test
    public void clickUsageItem() {
        clickUsagePage();

        IdlingRegistry.getInstance().register(mCountingIdlingResource);

        clickView("掘金");

        checkVisible(R.id.article_detail_web_view);
    }

}
