package com.example.foodappproject;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    //    Ánh XẠ các ID
    protected ScrollView homeScrollView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
//        Khai báo

        this.homeScrollView = (ScrollView) findViewById(R.id.homeScrollView);
//        Xử lí scroll view khi có dữ liệu

        if (isHasData()) {
            homeScrollView.setVisibility(View.VISIBLE);
//            show du lieu theo quantity
            showDataIntoScrollView(this.homeScrollView, 20);
        } else {
            homeScrollView.setVisibility(View.GONE);
        }

    }

    private boolean isHasData() {
        return true;
    }

    //    Ham show data in to srcoll view
    private void showDataIntoScrollView(ScrollView scrollview, int quantity) {

        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setRowCount(4);
        gridLayout.setColumnCount(2);

        for (int i = 0; i < quantity; i++) {

            addImageIntoLinearView(gridLayout, i);
        }
        scrollview.addView(gridLayout);
    }

    private void addImageIntoLinearView(GridLayout gridlayout, int i) {
        TextView textView = new TextView(this);
        textView.setWidth(400);
        textView.setHeight(600);
        textView.setText("Content " + i);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ShowItemProduct.class);
                Bundle bundle = new Bundle();
                bundle.putString("a", textView.getText()+"");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.width = GridLayout.LayoutParams.WRAP_CONTENT;
        params.height = GridLayout.LayoutParams.WRAP_CONTENT;
        params.setMargins(15, 8, 8, 8); // Thiết lập margins
        params.setGravity(Gravity.CENTER); // Thiết lập gravity
        gridlayout.addView(textView, params);
    }


}
