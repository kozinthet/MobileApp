package com.kozinthet.stevejobquote;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.kozinthet.stevejobquote.Fragment.FirstFragment;
import com.kozinthet.stevejobquote.Fragment.SecondFragment;
import com.kozinthet.stevejobquote.Fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    ViewPager vp_quote;
    Button btn_prev;
    Button btn_next;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_prev = (Button) findViewById(R.id.btn_prev);
        btn_next = (Button) findViewById(R.id.btn_next);
        vp_quote = (ViewPager) findViewById(R.id.vp_quote);

        vp_quote.setAdapter(new QuoteAdapter(getSupportFragmentManager()));
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vp_quote.getCurrentItem() != 0) {
                    vp_quote.setCurrentItem(vp_quote.getCurrentItem() - 1);
                } else {
                    Toast.makeText(getApplicationContext(), "First Quote, Idiot!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vp_quote.getCurrentItem() != 2) {
                    vp_quote.setCurrentItem(vp_quote.getCurrentItem() + 1);
                } else {
                    Toast.makeText(getApplicationContext(), "Last Quote, Idiot!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.kozinthet.stevejobquote/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.kozinthet.stevejobquote/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    private static class QuoteAdapter extends FragmentStatePagerAdapter {

        public QuoteAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                FirstFragment firstFragment = new FirstFragment();
                return firstFragment;
            } else if (position == 1) {
                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;
            } else {
                ThirdFragment thirdFragment = new ThirdFragment();
                return thirdFragment;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
