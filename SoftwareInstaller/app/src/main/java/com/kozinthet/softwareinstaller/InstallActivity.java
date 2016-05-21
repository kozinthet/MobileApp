package com.kozinthet.softwareinstaller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InstallActivity extends AppCompatActivity {

    Button install_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_install);

        install_btn = (Button) findViewById(R.id.install_btn);
        install_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Yay! I can sniff the phone bill code now!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(InstallActivity.this, PhoneBillActivity.class);
                startActivity(i);
            }
        });
    }
}
