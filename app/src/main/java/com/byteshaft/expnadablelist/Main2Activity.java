package com.byteshaft.expnadablelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout root = new RelativeLayout(this);
        ExpandableListView listView = new ExpandableListView(this);
        TextView textView = new TextView(this);
        textView.setText("SOme test");
        root.addView(textView);
        this.setContentView(root);

    }
}
