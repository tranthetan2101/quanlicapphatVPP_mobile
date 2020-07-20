package com.example.quanlivanphongpham;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnUser,btnPhongban,btnNhanvien,btnCapphatVPP,btnVanphongpham,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setControl();
        setEvent();
    }
    private void setEvent() {
        btnPhongban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,PhongbanActivity.class);
                startActivity(intent);
            }
        });
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,UserActivity.class);
                startActivity(intent);
            }
        });
        btnVanphongpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,VanphongphamActivity.class);
                startActivity(intent);
            }
        });
        btnNhanvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,NhanvienActivity.class);
                startActivity(intent);
            }
        });
        btnCapphatVPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,PhatVPPActivity.class);
                startActivity(intent);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this,android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Thông Báo");
                builder.setMessage("Bạn có muốn thoát?");

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
    private void setControl() {
        btnUser = findViewById(R.id.buttonUser);
        btnPhongban = findViewById(R.id.buttonPhongban);
        btnNhanvien = findViewById(R.id.buttonNhanvien);
        btnCapphatVPP = findViewById(R.id.buttonCapphatvpp);
        btnVanphongpham = findViewById(R.id.buttonVPP);
        btnThoat = findViewById(R.id.buttonThoat);
    }
}
