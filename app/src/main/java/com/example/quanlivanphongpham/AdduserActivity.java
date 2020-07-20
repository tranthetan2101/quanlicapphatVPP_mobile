package com.example.quanlivanphongpham;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdduserActivity extends AppCompatActivity {
    EditText txtHotenNV,txtTenUser,txtpassWord,txtNhaplaipass;
    Button btnDangki,btnSua,btnRefesh,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adduser);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnRefesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHotenNV.setText("");
                txtTenUser.setText("");
                txtpassWord.setText("");
                txtNhaplaipass.setText("");
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AdduserActivity.this);
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
        txtHotenNV = findViewById(R.id.editTextHotenNV);
        txtTenUser= findViewById(R.id.editTextTenuser);
        txtpassWord = findViewById(R.id.editTextPassword);
        txtNhaplaipass = findViewById(R.id.editTextNhaplaipass);
        btnDangki = findViewById(R.id.buttonDangki);
        btnSua = findViewById(R.id.buttonSua);
        btnRefesh = findViewById(R.id.buttonRefesh);
        btnThoat = findViewById(R.id.buttonThoat);
    }
}
