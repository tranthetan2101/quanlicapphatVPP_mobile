package com.example.quanlivanphongpham;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AddnhanvienActivity extends AppCompatActivity {
EditText txtMaNV,txtTenNV,txtChucvu,txtCMND,txtPhone,txtEmail;
Button btnThem,btnSua,btnRefesh,btnThoat;
Spinner spnPhongban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnhanvien);
        setControl();
        setEvent();
    }
    private void setEvent() {
        btnRefesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMaNV.setText("");
                txtTenNV.setText("");
                txtChucvu.setText("");
                txtCMND.setText("");
                txtPhone.setText("");
                txtEmail.setText("");
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AddnhanvienActivity.this);
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
        txtMaNV = findViewById(R.id.editTextMaNV);
        txtTenNV= findViewById(R.id.editTextTenNV);
        spnPhongban = findViewById(R.id.SpinnerPhongban);
        txtChucvu = findViewById(R.id.editTextChucvu);
        txtCMND = findViewById(R.id.editTextCMND);
        txtPhone = findViewById(R.id.editTextSDT);
        txtEmail = findViewById(R.id.editTextEmail);
        btnSua = findViewById(R.id.buttonSua);
        btnThem = findViewById(R.id.buttonThem);
        btnRefesh = findViewById(R.id.buttonRefesh);
        btnThoat = findViewById(R.id.buttonThoat);
    }
}
