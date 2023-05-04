package com.example.myapplication2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = (Button)findViewById(R.id.button3);
        String[] A = new String[3];
        A[0] = "A";
        A[1] = "B";
        A[2] = "C";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               View VI =  View.inflate(MainActivity2.this, R.layout.actvity_user,null);
                AlertDialog.Builder alertDbuilder2 = new AlertDialog.Builder(MainActivity2.this);

                alertDbuilder2.setView(VI);
                alertDbuilder2.setTitle("다른화면불러오기");
                alertDbuilder2.setNegativeButton("닫아" , null);
                alertDbuilder2.show();


//                AlertDialog.Builder alertDbuilder = new AlertDialog.Builder(MainActivity2.this);
//                alertDbuilder.setTitle("타이틀");
//                alertDbuilder.setMessage("메세지");
//                alertDbuilder.setSingleChoiceItems(A, 1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext(),  A[0],Toast.LENGTH_SHORT).show();
//                    }
//                });
//                alertDbuilder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext(),  A[0],Toast.LENGTH_SHORT).show();
//                    }
//                });
//                alertDbuilder.setNegativeButton("확인" ,null);
//                alertDbuilder.show();

            }
        });
    }
}