package com.example.mymsi.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText text = (EditText)findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("information",text.getText().toString());
             //   intent.putExtra("id",123456);
                startActivityForResult(intent,0);

            }
        });
    }
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            super.onActivityResult(requestCode, resultCode, data);
            if(requestCode==0 && resultCode==0){
                String str=data.getStringExtra("result");
                Toast.makeText(this,str,Toast.LENGTH_LONG).show();
            }
    }
}
