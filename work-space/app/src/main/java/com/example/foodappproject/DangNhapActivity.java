package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DangNhapActivity extends AppCompatActivity {

    private EditText edtUserName, edtPassword;
    private Button btnDangNhap, btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        // Ánh xạ các thành phần giao diện
        edtUserName = findViewById(R.id.userName);
        edtPassword = findViewById(R.id.passWord);
        btnDangNhap = findViewById(R.id.dangNhap);
        btnDangKy = findViewById(R.id.dangKy);


        // Xử lý sự kiện khi click vào nút "Đăng nhập"
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy thông tin đăng nhập từ EditText
                String userName = edtUserName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                // Thực hiện kiểm tra đăng nhập
                boolean loginSuccessful = true;
                if (loginSuccessful) {
                    // Đăng nhập thành công, thực hiện các hành động tiếp theo
                    // Ví dụ: Chuyển sang màn hình MainActivity
                    Intent intent = new Intent(DangNhapActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Đóng màn hình đăng nhập sau khi đăng nhập thành công
                } else {
                    // Đăng nhập không thành công, thông báo cho người dùng
                    Toast.makeText(DangNhapActivity.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Xử lý sự kiện khi click vào nút "Đăng ký"
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển đến màn hình đăng ký
                Intent intent = new Intent(DangNhapActivity.this, DangKiActivity.class);
                startActivity(intent);
            }
        });
    }
}
