package com.bernard.beaconportal.activities;

import com.bernard.beaconportal.R;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.bernard.beaconportal.adapters.CustomBaseAdapter;
import com.bernard.beaconportal.RowItem;
 
public class ImageTextListBaseAdapterActivity extends Activity implements
        OnItemClickListener {
 
    public static final String[] titles = new String[] { "History Homework",
            "Math Homework", "Spanish Homework", "English Homework" };
 
    public static final String[] descriptions = new String[] {
            "Desciption 1",
            "Desciption 2", "Description 3",
            "Description 4" };
    
    public static final String[] teachers = new String[] {
        "Anderson",
        "Klein", "Joya",
        "Reed" };
 
    public static final Integer[] images = { R.drawable.global_studies,
            R.drawable.mathematics, R.drawable.spanish, R.drawable.english };
 
    ListView listView;
    List<RowItem> rowItems;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homwork_due);
 
        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i], teachers[i]);
            rowItems.add(item);
        }
 
        listView = (ListView) findViewById(R.id.list);
        CustomBaseAdapter adapter = new CustomBaseAdapter(this, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
 
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
            long id) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
		toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}
