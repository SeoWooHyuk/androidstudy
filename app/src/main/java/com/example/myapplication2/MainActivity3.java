package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView txv = (TextView)findViewById(R.id.textView5);
        Button btn = (Button)findViewById(R.id.button2);

        registerForContextMenu(txv);
        registerForContextMenu(btn);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.a  )
        {
            Toast.makeText(getApplicationContext(),"a",Toast.LENGTH_SHORT).show();
        }else if(item.getTitle().equals("b"))
        {
            Toast.makeText(getApplicationContext(),"b",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().equals("c"))
        {
            Toast.makeText(getApplicationContext(),"c",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"d",Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.contextmenus,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getTitle().equals("a1") )
        {
            Toast.makeText(getApplicationContext(),"a1",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().equals("b1"))
        {
            Toast.makeText(getApplicationContext(),"b1",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().equals("c1"))
        {
            Toast.makeText(getApplicationContext(),"c1",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"d1",Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}