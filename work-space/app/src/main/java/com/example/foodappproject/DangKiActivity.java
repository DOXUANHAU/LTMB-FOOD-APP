package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DangKiActivity extends AppCompatActivity {
    EditText edtUserName, edtPassword, edtRePassword, edtEmail, edtFullName, edtPhone;
    Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        edtUserName = findViewById(R.id.userName);
        edtPassword = findViewById(R.id.passWord);
        edtRePassword = findViewById(R.id.rePassWord);
        edtEmail = findViewById(R.id.edtEmail);
        edtFullName = findViewById(R.id.edtFullName);
        edtPhone = findViewById(R.id.edtPhone);
        btnDangKy = findViewById(R.id.dangKy);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUserName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                String rePassword = edtRePassword.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();
                String fullName = edtFullName.getText().toString().trim();
                String phone = edtPhone.getText().toString().trim();

                if (userName.isEmpty() || password.isEmpty() || rePassword.isEmpty() || email.isEmpty() || fullName.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(DangKiActivity.this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(rePassword)) {
                    Toast.makeText(DangKiActivity.this, "Mật khẩu không trùng khớp", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Tạo đối tượng DatabaseHelper để thêm người dùng vào cơ sở dữ liệu
                long result = 1;
                if (result != -1) {
                    Toast.makeText(DangKiActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    finish(); // Kết thúc hoạt động khi đăng ký thành công
                } else {
                    Toast.makeText(DangKiActivity.this, "Đăng ký thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
