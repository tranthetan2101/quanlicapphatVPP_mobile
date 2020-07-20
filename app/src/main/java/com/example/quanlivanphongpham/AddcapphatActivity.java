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
import android.widget.Spinner;

public class AddcapphatActivity extends AppCompatActivity {
    EditText txtIDcapphat,txtSoluong,txtDonvi,txtNgaycap;
    Spinner spnPhongban,spnTenVPP;
    Button btnThem,btnSua,btnRefesh,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcapphat);
        setControl();
        setEvent();
    }
    private void setEvent() {
        btnRefesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtIDcapphat.setText("");
                txtSoluong.setText("");
                txtDonvi.setText("");
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AddcapphatActivity.this);
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
        txtIDcapphat =findViewById(R.id.editTextIDcap);
        txtDonvi =findViewById(R.id.editTextDonvi);
        txtSoluong =findViewById(R.id.editTextSoluong);
        spnPhongban =findViewById(R.id.SpinnerPhongban);
        spnTenVPP =findViewById(R.id.SpinnerTenVPP);
        btnRefesh =findViewById(R.id.buttonRefesh);
        btnSua =findViewById(R.id.buttonSua);
        btnThem =findViewById(R.id.buttonThem);
        btnThoat =findViewById(R.id.buttonThoat);
        txtNgaycap =findViewById(R.id.editTextIDcap);
    }
}
