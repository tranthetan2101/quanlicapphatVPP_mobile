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

public class PhongbanActivity extends AppCompatActivity {
    EditText txtMaphongban,txtTenphongban;
    ListView lvDanhsachphongban;
    Button btnTimkiem,btnThem,btnRefesh,btnXoa,btnSua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phongban);
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
                Intent intent = new Intent(PhongbanActivity.this,MenuActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonExit:
                AlertDialog.Builder builder = new AlertDialog.Builder(PhongbanActivity.this);
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
        btnRefesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMaphongban.setText("");
                txtTenphongban.setText("");
            }
        });
    }
    private void setControl() {
        txtMaphongban = findViewById(R.id.editTextMaphongban);
        txtTenphongban = findViewById(R.id.editTextTenphongban);
        lvDanhsachphongban = findViewById(R.id.ListviewDanhSachPB);
        btnTimkiem = findViewById(R.id.buttonTimkiem);
        btnThem = findViewById(R.id.buttonThem);
        btnRefesh = findViewById(R.id.buttonRefesh);
        btnXoa = findViewById(R.id.buttonXoa);
        btnSua = findViewById(R.id.buttonSua);
    }
}
