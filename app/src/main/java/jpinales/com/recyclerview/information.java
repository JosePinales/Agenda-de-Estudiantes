package jpinales.com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class information extends AppCompatActivity implements View.OnClickListener {


    TextView t;
    TextView b;
    ImageView i;
    String body, title;
    int image;

    String longitud, latitud, direccion;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        t =  findViewById(R.id.text2);
        b =  findViewById(R.id.text1);
        i =  findViewById(R.id.image2);

        image =  getIntent().getIntExtra("Ima", 0);
        title = getIntent().getStringExtra("Title");
        body = getIntent().getStringExtra("Body");

        t.setText(title);
        b.setText(body);
        i.setImageResource(image);



        //MAPS
        String [] division = body.split("\n");
        String [] di= division [3].split(":");
        String [] la= division [4].split("=");
        String [] lo= division [5].split("=");

        direccion=di[1];
        latitud=la[1];
        longitud=lo[1];

    }

    public void click2(View view) {

        Intent window3 = new Intent(information.this, MainActivity.class);
        startActivity(window3);

    }

    @Override
 public void onClick(View v) {


    }
    public void map(View view) {
        Intent window3 = new Intent(information.this, Maps.class);
        window3.putExtra("latitud", latitud);
        window3.putExtra("longitud", longitud);
        window3.putExtra("direccion", direccion);
        startActivity(window3);

    }
}
