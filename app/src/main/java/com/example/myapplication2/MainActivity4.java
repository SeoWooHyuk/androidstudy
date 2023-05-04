package com.example.myapplication2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button BT1 = (Button)findViewById(R.id.button4);
        EditText txv = (EditText)findViewById(R.id.editTextText);
        EditText txv1 = (EditText)findViewById(R.id.editTextText3);

        Button BT5 = (Button)findViewById(R.id.button5);



        BT1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View VI =  View.inflate(MainActivity4.this, R.layout.activity4_user,null);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);

                EditText txv3 = (EditText)VI.findViewById(R.id.editTextText4);
                EditText txv4 = (EditText)VI.findViewById(R.id.editTextText5);


                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txv.setText(txv3.getText());
                        txv1.setText(txv4.getText());
                    }
                });
                builder.setNegativeButton("취소",null);

                builder.setView(VI);
                builder.show();
            }
        });




        BT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class); //화면전환
                startActivity(intent);
            }
        });


    }
}