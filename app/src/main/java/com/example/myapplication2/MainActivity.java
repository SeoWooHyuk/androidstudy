package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         Button btn = (Button) findViewById(R.id.button);
         RadioGroup RA = (RadioGroup)findViewById(R.id.RADIOGROUPS);
         TextView tv6 = (TextView)findViewById(R.id.textView6);
         Button bt2 = (Button)findViewById(R.id.button16);
         ImageView img = (ImageView)findViewById(R.id.imageView2);
         RadioButton ra4 = (RadioButton)findViewById(R.id.radioButton4);
         RadioButton ra5 = (RadioButton)findViewById(R.id.radioButton5);
         RadioButton ra6 = (RadioButton)findViewById(R.id.radioButton6);
         CheckBox ch3  = (CheckBox)findViewById(R.id.checkBox3); //선택을 시작하겠습니까


         btn.setOnClickListener(new View.OnClickListener() {
             int countsd = 1;
             @Override
             public void onClick(View v) {


                 if(countsd == 1)
                 {
                     Toast.makeText(getApplicationContext(),"안녕하세요",Toast.LENGTH_SHORT).show();
                 }
                 else if(countsd == 2)
                 {
                     Toast.makeText(getApplicationContext(),"한번만눌러",Toast.LENGTH_SHORT).show();
                 }
                 else if(countsd == 3)
                 {
                     Toast.makeText(getApplicationContext(),"그만눌러",Toast.LENGTH_SHORT).show();
                 }
                 else if(countsd == 4)
                 {
                     Toast.makeText(getApplicationContext(),"그만아아아앙ㄴ",Toast.LENGTH_LONG).show();
                     countsd = 0;
                 }
                 countsd++;




             }
         });

        ra4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.cat);
            }
        });

        ra5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.dog);
            }
        });

        ra6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.catlabit);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.VISIBLE);
            }
        });

        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    RA.setVisibility(View.VISIBLE);
                    tv6.setVisibility(View.VISIBLE);
                    bt2.setVisibility(View.VISIBLE);
                }
                else {
                    RA.setVisibility(View.INVISIBLE);
                    tv6.setVisibility(View.INVISIBLE);
                    bt2.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

//        ch3.setOnClickListener(new View.OnClickListener() {
//        int check = 1;
//
//         @Override
//         public void onClick(View v) {
//
//            if(check == 1) {
//                RA.setVisibility(View.VISIBLE);
//                tv6.setVisibility(View.VISIBLE);
//                bt2.setVisibility(View.VISIBLE);
//
//                check =0;
//            }
//            else if(check == 0)
//            {
//                RA.setVisibility(View.INVISIBLE);
//                tv6.setVisibility(View.INVISIBLE);
//                bt2.setVisibility(View.INVISIBLE);
//                img.setVisibility(View.INVISIBLE);
//                check =1;
//            }
//         }
//     });

    }
}