package com.terrysong;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.terrysong.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.tvNameId.setText("terrySong");
        activityMainBinding.tvPasswordId.setText("123456");
        activityMainBinding.tvNameId.setOnClickListener(this);
        activityMainBinding.tvPasswordId.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "123123123", Toast.LENGTH_SHORT).show();
    }
}
