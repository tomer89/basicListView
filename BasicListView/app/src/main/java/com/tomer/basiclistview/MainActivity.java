package com.tomer.basiclistview;

import android.app.Activity;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    //based by the tutorial https://www.youtube.com/watch?v=BSZLqBWKTHw

    ListView listView;
    String[] days = {"Sunday", "Monday", "Tuesday", "Wedensday", "Thursday", "Friday", "Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        // the constructor works like this (where to put the list, the look of every row, the list of things to convert to the look of every row)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,days);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view /*this the row that was clicked*/, int position, long id) {
        TextView temp = (TextView) view;
        Toast.makeText(this,temp.getText()+ " " + position, Toast.LENGTH_SHORT).show();
    }

}
