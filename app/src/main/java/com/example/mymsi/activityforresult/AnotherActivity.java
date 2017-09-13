package com.example.mymsi.activityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent = getIntent();
        String infor = intent.getStringExtra("information");
      //  Integer id = intent.getIntExtra("id",123456);
        String in = "PersonalInformation:" + infor;
        intent.putExtra("result", in);
        Toast.makeText(AnotherActivity.this ,infor, Toast.LENGTH_LONG).show();
        Button bt = (Button)findViewById(R.id.buttonReturn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                setResult(0,intent);
                finish();
            }
        });
    }
}