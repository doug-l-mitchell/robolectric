package org.robolectric.shadows;

import android.app.Activity;
import android.widget.Spinner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.TestRunners;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(TestRunners.WithDefaults.class)
public class SpinnerTest {

  private Spinner spinner;

  @Before
  public void beforeTests() {
    spinner = new Spinner(new Activity());
  }

  @Test
  public void testPrompt() {
    spinner.setPrompt("foo");

    assertThat(spinner.getPrompt().toString()).isEqualTo("foo");
  }
}
