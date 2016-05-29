package com.kozinthet.listingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kozinthet.listingproject.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecycleView;
    List<String> mState = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView = (RecyclerView) findViewById(R.id.recycler_main);

        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Yangon");
        mState.add("Mandlalay");
        mState.add("Nay Pyi Daw");
        mState.add("Maw La Myne");
        mState.add("Maw La Myne");
        mState.add("Maw La Myne");

        mRecycleView.setHasFixedSize(true);

        LinearLayoutManager lm = new LinearLayoutManager(this);

        mRecycleView.setLayoutManager(lm);

        MainAdapter mainAdapter = new MainAdapter(mState, getApplicationContext());

        mRecycleView.setAdapter(mainAdapter);
    }
}
