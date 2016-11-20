package com.terrysong;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.terrysong.databinding.ActivityDemoBinding;

public class DemoActivity extends AppCompatActivity implements View.OnClickListener {

    private Person person = new Person("song","123123");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemoBinding activityDemoBinding =
                DataBindingUtil.setContentView(this,R.layout.activity_demo);

//        activityDemoBinding.setPerson(person);

        activityDemoBinding.setVariable(com.terrysong.BR.person,person);

        activityDemoBinding.setPresenter(new Presenter());
    }


    /*自定义一个类，必须为public,里面给一个onClick方法（原则上该类名和onClick都可换为其他名字）*/
    public class Presenter{
        public void onClick(View view){
            switch (view.getId()){
                case R.id.tv_name_id://触发对应id的控件
                    Toast.makeText(DemoActivity.this, "123", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tv_password_id://触发对应id的控件
                    Toast.makeText(DemoActivity.this, "456", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this, "123123123", Toast.LENGTH_SHORT).show();
    }
}
