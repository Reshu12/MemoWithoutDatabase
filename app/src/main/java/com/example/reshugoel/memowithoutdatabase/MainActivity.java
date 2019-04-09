package com.example.reshugoel.memowithoutdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text=(TextView)findViewById(R.id.empty);
        Button addrem=(Button) findViewById(R.id.add);
        final ImageButton delete = (ImageButton) findViewById(R.id.delete);
        delete.setVisibility(View.INVISIBLE);

        addrem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,setMemo.class);
                startActivity(intent);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("No Task");
                delete.setVisibility(View.INVISIBLE);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            text.setText(value);
            delete.setVisibility(View.VISIBLE);
        }else{
            text.setText("No Task");
        }
    }
}
