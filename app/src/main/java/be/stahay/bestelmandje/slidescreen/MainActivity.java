package be.stahay.bestelmandje.slidescreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(() -> {
            try {
                Thread.sleep(2500);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            } finally {
                startActivity(new Intent(MainActivity.this, LoaderActivity.class));
            }
        }).start();
    }
}
