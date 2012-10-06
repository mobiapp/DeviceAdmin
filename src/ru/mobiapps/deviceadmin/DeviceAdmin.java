package ru.mobiapps.deviceadmin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DeviceAdmin extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_admin);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_device_admin, menu);
        return true;
    }
}
