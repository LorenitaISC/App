package itsj.zipsalud.zipsalud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void congenitas(View view){
        Intent i = new Intent(this,EnfermedadesCongenitas.class);
        startActivity(i);

    }
}
