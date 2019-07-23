package com.as.demo_ok37_float;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView iv = findViewById(R.id.iv);
//        TextView tv = findViewById(R.id.tv);
//
//        iv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "图片", Toast.LENGTH_SHORT).show();
//            }
//        });
//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "文字", Toast.LENGTH_SHORT).show();
//            }
//        });


        DragFloatView viewById = findViewById(R.id.dfv);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击", Toast.LENGTH_SHORT).show();
            }
        });
//
//        View iv1 = findViewById(R.id.iv1);
//        View iv2 = findViewById(R.id.iv2);
//
//        iv1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "我是图片1", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        iv2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "我是图片2", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
