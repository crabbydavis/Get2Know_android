package crabbman.get2know.UI;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.util.DisplayMetrics;
import android.view.Window;

import crabbman.get2know.R;

/**
 * Created by crabbydavis on 1/30/17.
 */

public class MainActivityPopUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        setContentView(R.layout.popup_main_activity);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * .8), (int)(height * .8));
    }
}
