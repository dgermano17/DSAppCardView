package br.com.etecia.appcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_back_dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mFav:
                startActivity(new Intent(MainActivity.this, Activity_Favoritos.class));
                break;
            case R.id.mComp:
                startActivity(new Intent(MainActivity.this, Activity_Compartilhar.class));
                break;
            case R.id.mInfo:
                startActivity(new Intent(MainActivity.this, Activity_Sobre.class));
                break;
            case R.id.mConfig:
                startActivity(new Intent(MainActivity.this, Activity_Configuracoes.class));
                break;
            case R.id.mTempo:
                startActivity(new Intent(MainActivity.this, Activity_Tempo.class));
                break;
        }
            return super.onOptionsItemSelected(item);
    }
}