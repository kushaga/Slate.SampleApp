package com.codehelixsolutions.slate.sampleapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.codehelixsolutions.slate.sampleapp.lib.ActivityBase;
import com.slate.templates.templating.TemplateView;

public class Activity2 extends ActivityBase implements View.OnClickListener {

    private TemplateView mTemplateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        configureActionBar();
        TemplateView view = inflateTemplateInto("slate_sample1.txt", true, R.id.pageMainContainer, R.id.pageMainErrorMessage);

        if (view != null) {
            // 2. Now register callback events
            view.setOnClickListener("icPhone", this);
            view.setOnClickListener("icChat", this);
            view.setOnClickListener("icShare", this);
        }
        // 3. Store reference to templated view.
        mTemplateView = view;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}
