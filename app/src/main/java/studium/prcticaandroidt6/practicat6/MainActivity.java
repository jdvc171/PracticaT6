package studium.prcticaandroidt6.practicat6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgPer,imgBlc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPer = findViewById(R.id.imgPersonas);
        imgBlc = findViewById(R.id.imgBloc);

        imgPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        contactos.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        imgBlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        bloc.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mnu_mainactivity,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnuItemPersonas:
                Intent intent = new Intent(MainActivity.this,
                        contactos.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                break;
            case R.id.mnuItemBloc:
                Intent intent2 = new Intent(MainActivity.this,
                        bloc.class);
                //Iniciamos la nueva actividad
                startActivity(intent2);
                break;
        }

        return true;
    }
}
