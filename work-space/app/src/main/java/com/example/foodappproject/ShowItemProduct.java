package com.example.foodappproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowItemProduct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_item_product);

        // Nhận Intent từ Activity gọi
        Intent intent = getIntent();

// Trích xuất Bundle từ Intent
        Bundle bundle = intent.getExtras();

// Trích xuất dữ liệu từ Bundle
        String value = bundle.getString("a");
        TextView textView = (TextView) findViewById(R.id.viewBundle);
        textView.setText(value+"");
    }
}
