package studium.prcticaandroidt6.practicat6;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

public class contactos extends AppCompatActivity {

    ImageView imgCont1,imgCont2,imgCont3,imgCont4,imgCont5,imgCont6;
    int idImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

        imgCont1 = findViewById(R.id.imgCont1);
        imgCont2 = findViewById(R.id.imgCont2);
        imgCont3 = findViewById(R.id.imgCont3);
        imgCont4 = findViewById(R.id.imgCont4);
        imgCont5 = findViewById(R.id.imgCont5);
        imgCont6 = findViewById(R.id.imgCont6);

        registerForContextMenu(imgCont1);
        registerForContextMenu(imgCont2);
        registerForContextMenu(imgCont3);
        registerForContextMenu(imgCont4);
        registerForContextMenu(imgCont5);
        registerForContextMenu(imgCont6);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mnu_preferencias,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ItemMnuPreferencias:
                Intent intent = new Intent(contactos.this,
                        Preferencias.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                break;
        }

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        idImagen = v.getId();
        switch (idImagen){
            case R.id.imgCont1:

                inflater.inflate(R.menu.opciones,menu);

                break;
            case R.id.imgCont2:

                inflater.inflate(R.menu.opciones,menu);

                break;
            case R.id.imgCont3:

                inflater.inflate(R.menu.opciones,menu);

                break;
            case R.id.imgCont4:

                inflater.inflate(R.menu.opciones,menu);

                break;
            case R.id.imgCont5:

                inflater.inflate(R.menu.opciones,menu);

                break;
            case R.id.imgCont6:

                inflater.inflate(R.menu.opciones,menu);

                break;
        }


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemLlamar:

                if(idImagen==R.id.imgCont1){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String tel = prefs.getString("TlfContacto1","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.numeroToast);

                    if(tel==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        Uri number =  Uri.parse("tel:"+tel);
                        Intent i = new Intent(Intent.ACTION_DIAL, number);

                        startActivity(i);
                    }

                }
                else if(idImagen==R.id.imgCont2){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String tel = prefs.getString("TlfContacto2","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.numeroToast);
                    if(tel==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        Uri number =  Uri.parse("tel:"+tel);
                        Intent i = new Intent(Intent.ACTION_DIAL, number);

                        startActivity(i);
                    }

                }

                else if(idImagen==R.id.imgCont3){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String tel = prefs.getString("TlfContacto3","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.numeroToast);
                    if(tel==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        Uri number =  Uri.parse("tel:"+tel);
                        Intent i = new Intent(Intent.ACTION_DIAL, number);

                        startActivity(i);
                    }

                }

                else if(idImagen==R.id.imgCont4){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String tel = prefs.getString("TlfContacto4","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.numeroToast);
                    if(tel==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        Uri number =  Uri.parse("tel:"+tel);
                        Intent i = new Intent(Intent.ACTION_DIAL, number);

                        startActivity(i);
                    }

                }

                else if(idImagen==R.id.imgCont5){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String tel = prefs.getString("TlfContacto5","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.numeroToast);
                    if(tel==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        Uri number =  Uri.parse("tel:"+tel);
                        Intent i = new Intent(Intent.ACTION_DIAL, number);

                        startActivity(i);
                    }

                }

                else if(idImagen==R.id.imgCont6){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String tel = prefs.getString("TlfContacto6","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.numeroToast);
                    if(tel==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        Uri number =  Uri.parse("tel:"+tel);
                        Intent i = new Intent(Intent.ACTION_DIAL, number);

                        startActivity(i);
                    }

                }

                break;

            case R.id.itemCorreo:

                if(idImagen==R.id.imgCont1){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String correo = prefs.getString("CorreoContacto1","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.correoToast);
                    if(correo==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        String email = correo;
                        String[] emails = correo.split(",");
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, emails);


                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));
                    }

                }
                else if(idImagen==R.id.imgCont2){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String correo = prefs.getString("CorreoContacto2","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.correoToast);
                    if(correo==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        String email = correo;
                        String[] emails = correo.split(",");
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, emails);

                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));
                    }

                }

                else if(idImagen==R.id.imgCont3){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String correo = prefs.getString("CorreoContacto3","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.correoToast);
                    if(correo==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        String email = correo;
                        String[] emails = correo.split(",");
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, emails);

                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));
                    }

                }

                else if(idImagen==R.id.imgCont4){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String correo = prefs.getString("CorreoContacto4","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.correoToast);
                    if(correo==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        String email = correo;
                        String[] emails = correo.split(",");
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, emails);

                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));
                    }

                }

                else if(idImagen==R.id.imgCont5){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String correo = prefs.getString("CorreoContacto5","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.correoToast);
                    if(correo==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        String email = correo;
                        String[] emails = correo.split(",");
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, emails);

                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));
                    }

                }

                else if(idImagen==R.id.imgCont6){

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(contactos.this);
                    String correo = prefs.getString("CorreoContacto6","");
                    Resources res = getResources();
                    String toast = res.getString(R.string.correoToast);
                    if(correo==""){
                        Toast.makeText(contactos.this,toast,Toast.LENGTH_LONG).show();
                    }
                    else {
                        String email = correo;
                        String[] emails = correo.split(",");
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, emails);

                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));
                    }
                }

                break;
        }

        return super.onContextItemSelected(item);
    }
}
