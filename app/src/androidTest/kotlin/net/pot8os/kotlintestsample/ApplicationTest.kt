package net.pot8os.kotlintestsample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.text.DecimalFormat

/**
 * It's a typical test code for AndroidTest. You can run this as unit tests using Robolectric 4.
 * See also [EmulatedApplicationTest] and build.gradle.
 *
 * @author So Nakamura, 2015/12/19
 */
@RunWith(AndroidJUnit4::class)
class ApplicationTest {

  @get:Rule
  val activity = ActivityTestRule(MainActivity::class.java)

  @Test
  fun testAdd() {
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_2)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_add)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_2)).perform(click())
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    onView(withId(R.id.field))
        .check(matches(withText("${123 + 321}")))
  }

  @Test
  fun testSub() {
    onView(withId(R.id.button_9)).perform(click())
    onView(withId(R.id.button_9)).perform(click())
    onView(withId(R.id.button_9)).perform(click())
    onView(withId(R.id.button_sub)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    onView(withId(R.id.field))
        .check(matches(withText("${999 - 333}")))
  }

  @Test
  fun testMulti() {
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_multi)).perform(click())
    onView(withId(R.id.button_2)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    val formatter = DecimalFormat("#,###")
    onView(withId(R.id.field))
        .check(matches(withText(formatter.format(100 * 200))))
  }

  @Test
  fun testDiv() {
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_divide)).perform(click())
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    onView(withId(R.id.field))
        .check(matches(withText("${333 / 100.0}")))
  }
}
