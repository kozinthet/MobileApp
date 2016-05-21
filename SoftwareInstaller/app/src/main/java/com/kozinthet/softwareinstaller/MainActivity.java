package com.kozinthet.softwareinstaller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button download_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        download_btn = (Button) findViewById(R.id.download_btn);
        download_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Yay! I could change the activity", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, InstallActivity.class);
                startActivity(i);
            }
        });
    }
}
