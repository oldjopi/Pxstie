package com.example.pxstie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CuentaActivity extends AppCompatActivity implements View.OnClickListener{

    Window window;
    Button btnVolver;
    TextView txtMasInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        btnVolver = findViewById(R.id.btnVolver);
        txtMasInfo = findViewById(R.id.txtMasInfo);

        btnVolver.setOnClickListener(this);
        txtMasInfo.setOnClickListener(this);

        String colorbarra = "#0B7EC5";
        this.window = getWindow();
        window.setStatusBarColor(Color.parseColor(colorbarra));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnVolver:
                startActivity(new Intent(this, ContenedorActivity.class));
                finish();
                break;
            case R.id.txtMasInfo:
                startActivity(new Intent(this, MasInfoActivity.class));
                finish();
                break;
        }
    }
}