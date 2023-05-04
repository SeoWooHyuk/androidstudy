package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        LV = (ListView)findViewById(R.id.listV);

        String[] str = new String[2];
        for (int i = 0; i < 2 ; i++)
        {
            str[i] = "a"+i;
        }

        ArrayAdapter<String> Aradpt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,str);

        LV.setAdapter(Aradpt);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Toast.makeText(getApplicationContext(),"a0",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(getApplicationContext(),"a1",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}