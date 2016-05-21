package com.kozinthet.softwareinstaller;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneBillActivity extends AppCompatActivity {

    Button phone_bill_btn;
    EditText phone_bill_text_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_bill);

        phone_bill_btn = (Button) findViewById(R.id.phone_bill_btn);
        phone_bill_text_box = (EditText) findViewById(R.id.phone_bill_text_box);

        phone_bill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable message = phone_bill_text_box.getText();
//                Toast.makeText(getApplicationContext(), message.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_CALL);

                intent.setData(Uri.parse("tel:*123*" + message.toString() + "*09420283533#"));
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);
            }
        });
    }
}
