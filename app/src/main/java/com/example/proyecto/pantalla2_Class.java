package com.example.proyecto;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.app.SearchManager;

import androidx.appcompat.app.AppCompatActivity;

public class pantalla2_Class extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_scarlethoviedo);
    }
    public void boton2 (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void boton3 (View v){
        Intent i;
        PackageManager manager = getPackageManager();
        i = manager.getLaunchIntentForPackage("com.whatsapp");
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);

    }

    public void boton4 (View v){
        Intent intent= new Intent(Intent.ACTION_WEB_SEARCH );
        intent.putExtra(SearchManager.QUERY, "Intent y activities");
        startActivity(intent);

    }

    public void boton5 (View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://contacts/people/"));
        startActivity(intent);

    }
}
