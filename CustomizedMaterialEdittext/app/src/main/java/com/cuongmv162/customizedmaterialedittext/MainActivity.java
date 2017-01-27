package com.cuongmv162.customizedmaterialedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cuongmv162.customizedmaterialedittext.view.customized.MyMaterialEdittext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMaterialEdittext email = (MyMaterialEdittext) findViewById(R.id.material_edittext_email);
        email.setPlaceholder("Email");
        email.setTopMessageStacked(true);

        MyMaterialEdittext username = (MyMaterialEdittext) findViewById(R.id.material_edittext_username);
        username.setPlaceholder("Username");
        username.setTopMessageStacked(false);

        final Button submit = (Button) findViewById(R.id.submit);
    }
}
