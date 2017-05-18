package silverk.daizhige.com.mymvptest.Base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import silverk.daizhige.com.mymvptest.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
