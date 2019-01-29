package studium.prcticaandroidt6.practicat6;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class bloc extends AppCompatActivity {

    final String fichero = "";
    SharedPreferences prefs;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloc);
        prefs = getSharedPreferences(fichero, Context.MODE_PRIVATE);
        editText = findViewById(R.id.EditText);
        editText.setText(prefs.getString("texto",""));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mnu_bloc,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnuItemBloc:
                preferences();
                Toast.makeText(bloc.this,"Nota guardada",Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }

    public void preferences (){

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("texto",editText.getText().toString());
        editor.commit();

    }
}
