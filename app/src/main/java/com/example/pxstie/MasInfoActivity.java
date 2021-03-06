package com.example.pxstie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class MasInfoActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView btnVolver;
    private Usuario user;
    private TextView txtNom, txtUser, txtFecha, txtGenero;
    Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_info);

        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(this);

        txtNom = findViewById(R.id.txtNom);
        txtUser = findViewById(R.id.txtUser);
        txtFecha = findViewById(R.id.txtFecha);
        txtGenero = findViewById(R.id.txtGenero);

        user = Preferences.getUserData(this);

        txtNom.setText(user.getNombre());
        txtUser.setText(user.getCorreo());
        txtFecha.setText(user.getFecha());
        txtGenero.setText(user.getGenero());

        String colorbarra = "#F8F8F8";

        this.window = getWindow();
        //barcolor
        window.setStatusBarColor(Color.parseColor(colorbarra));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnVolver:
                onBackPressed();
                break;
        }
    }
}
