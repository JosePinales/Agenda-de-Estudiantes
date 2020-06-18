package jpinales.com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import android.os.Bundle;

public class Login extends AppCompatActivity {

    EditText cam1, cam2;
    String pass;
    String user;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cam1= (EditText) findViewById(R.id.txtcam1);
        cam2= (EditText) findViewById(R.id.txtcam2);

    }

    public void click(View view) {
        cam1.setText("");
        cam2.setText("");
    }

    public void Login(View view){
        user=cam1.getText().toString();
        pass=cam2.getText().toString();

        if (user.isEmpty() ){
            Toast.makeText(this,"Favor introdusca usuario", Toast.LENGTH_LONG).show();
        }
        if (pass.isEmpty()){
            Toast.makeText(this,"Favor introdusca contraseña", Toast.LENGTH_LONG).show();
        }


        else {
            if (user.equals("Jpinales") && pass.equals("1234")) {
                Intent window = new Intent(Login.this, MainActivity.class);
                startActivity(window);

            } else {
                Toast.makeText(this, "Usuario o contraseña incorreta", Toast.LENGTH_LONG).show();
            }
        }
    }


}
