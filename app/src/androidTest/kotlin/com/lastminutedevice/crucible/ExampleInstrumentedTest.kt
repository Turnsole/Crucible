package com.lastminutedevice.crucible

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import com.lastminutedevice.crucible.R

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val launchRule = ActivityTestRule <MainActivity> (MainActivity::class.java)

    @Test
    fun launchMainActivity() {
        Espresso.onView(ViewMatchers.withId(R.id.generated_contents))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
