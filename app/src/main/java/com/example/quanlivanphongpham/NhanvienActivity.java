package com.example.quanlivanphongpham;

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
import android.widget.ListView;
import android.widget.Spinner;

public class NhanvienActivity extends AppCompatActivity {
    EditText txtMaNV;
    Spinner spnPhongban;
    ListView lvDanhsachNV;
    Button btnTimkiem,btnThemNV,btnXoa,btnSua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhanvien);
        setControl();
        setEvent();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.buttonMenu:
                Intent intent = new Intent(NhanvienActivity.this,MenuActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonExit:
                AlertDialog.Builder builder = new AlertDialog.Builder(NhanvienActivity.this);
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
                break;
        }
        return true;
    }
    private void setEvent() {
        btnThemNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NhanvienActivity.this,AddnhanvienActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setControl() {
        txtMaNV = findViewById(R.id.editTextMaNV);
        spnPhongban =findViewById(R.id.SpinnerPhongban);
        lvDanhsachNV = findViewById(R.id.ListviewDanhSachNV);
        btnTimkiem = findViewById(R.id.buttonTimkiem);
        btnThemNV = findViewById(R.id.buttonThem);
        btnXoa = findViewById(R.id.buttonXoa);
        btnSua = findViewById(R.id.buttonSua);
    }
}
