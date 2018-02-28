package com.lastminutedevice.crucible;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.lastminutedevice.crucible.UtilsKt.almostDeadCode;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String text = UtilsKt.generateString();
        ((TextView) findViewById(R.id.generated_contents)).setText(text);

        if (false) {
            /**
             * This will never get executed in the app, only in unit tests.
             * (Demonstrates the difference in coverage.)
             */
            almostDeadCode();
        }
    }
}
