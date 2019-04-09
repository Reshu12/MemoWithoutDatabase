package com.example.reshugoel.memowithoutdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class setMemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_memo);
        final EditText enterTitle = (EditText) findViewById(R.id.title);
        Button confirm=(Button) findViewById(R.id.confirm);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=enterTitle.getText().toString().trim();
                if(title.equals("")){
                    enterTitle.setError("can't be blank");
                }else{
                    Intent i = new Intent(setMemo.this, MainActivity.class);
                    i.putExtra("key",title);
                    startActivity(i);
                }

            }
        });
    }
}
