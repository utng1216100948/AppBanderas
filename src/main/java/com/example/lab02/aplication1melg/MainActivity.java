package com.example.lab02.aplication1melg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtPais;
    ImageView imgBandera;
    Button btnAceptar;
    Button btnNuevo;
    //Arreglo de paises
    String[] paises={"Alemania","Argentina","Australia","Austria","Bahamas","Brasil","Chile","México"};
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Relacionar los objetos  de la lista con la clase Java
        txtPais = (TextView)findViewById(R.id.txt_pais);
        imgBandera = (ImageView)findViewById(R.id.img_bandera);
        btnAceptar = (Button)findViewById(R.id.btn_aceptar);
        btnNuevo = (Button)findViewById(R.id.btn_nuevo);

        //Programar acción de los botones
        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Crear objeto de clase Random
                Random r= new Random();
                //Ajusta el mmaximo entero al numero de paises que se agregen
                x= r.nextInt(paises.length);
                //Cargar imagenes
                switch(x){
                    case 0:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.alemania));
                        break;
                    case 1:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.argentina));
                        break;
                    case 2:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.australia));
                        break;
                    case 3:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.austria));
                        break;
                    case 4:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.bahamas));
                        break;
                    case 5:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.brasil));
                        break;
                    case 6:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.chile));
                        break;
                    case 7:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.mexico));
                        break;
                }
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String respuesta;
                String pais;
                pais = paises[x];
                respuesta = txtPais.getText().toString();
                if(respuesta.equalsIgnoreCase(pais)){
                    Toast.makeText(getApplication(),"¡Correcto!",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplication(),"Incorrecto, es ... "+pais,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}