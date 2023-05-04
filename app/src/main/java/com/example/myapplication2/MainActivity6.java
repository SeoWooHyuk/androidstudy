package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    Button btn;
    EditText etext;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn = (Button)findViewById(R.id.button6);
        etext = (EditText) findViewById(R.id.editTextText6);
        lv = (ListView) findViewById(R.id.lvs);

        ArrayList<String> list = new ArrayList<String>();
        ArrayAdapter<String> Aradpt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,list);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(etext.getText().toString());
                lv.deferNotifyDataSetChanged();
                lv.setAdapter(Aradpt);
                etext.setText("");
            }
        });




        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i = 0; i < list.size(); i++)
                {
                    if(position == i)
                    {
                        list.remove(i);
                        lv.setAdapter(Aradpt);
                        break;
                    }
                }
                return false;
            }
        });






    }
}