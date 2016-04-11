package cirvirlab.horizontalandverticalautomatically;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements  Comm{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void response(String some_data) {
        FragmentManager fragmentManager = getFragmentManager();
        Lower lower = (Lower)fragmentManager.findFragmentById(R.id.fragmentB);
        lower.changeDisplay(some_data);
    }
}
