package com.cuongmv162.customizedmaterialedittext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.cuongmv162.customizedmaterialedittext.feedback.FeedbackActivity;
import com.cuongmv162.customizedmaterialedittext.view.FontUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button feedback = (Button) findViewById(R.id.feedback);
        feedback.setTypeface(FontUtil.getTypeface(this, FontUtil.NOTO_SANS_BOLD));
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}
