package com.hungryjack.testdbinding.testdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.hungryjack.testdbinding.testdatabinding.databinding.ActivityMainBinding;
import com.hungryjack.testdbinding.testdatabinding.databinding.FragmentDetailBinding;
import com.hungryjack.testdbinding.testdatabinding.databinding.FragmentListBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentListBinding binding = DataBindingUtil.setContentView(this, R.layout.fragment_list);
        Staff staff = new Staff("Jelly Bean", "jellybean@gmail.com");
        binding.setStaff(staff);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
