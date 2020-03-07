package co.edu.uniminuto.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View v){
        EditText txtNombre = findViewById(R.id.txtNombre);
        Toast mensaje = Toast.makeText(this,"Hola "+txtNombre.getText(),Toast.LENGTH_SHORT);
        mensaje.setGravity(Gravity.CENTER,0,0);
        mensaje.show();
    }
}
