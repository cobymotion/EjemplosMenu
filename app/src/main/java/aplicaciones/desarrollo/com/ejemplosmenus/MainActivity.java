package aplicaciones.desarrollo.com.ejemplosmenus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.button);
        registerForContextMenu(boton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mi_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View v,
                                    ContextMenu.ContextMenuInfo
                                            menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_contexto,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        Toast t = Toast.makeText(this,"",Toast.LENGTH_LONG);
        switch (id)
        {
            case R.id.contexto1:
                t.setText("Diste la opcion 1");
                break;
            case R.id.contexto2:
                t.setText("Diste la opcion 2");
                break;
        }
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id)
        {
            case R.id.simple1:
                Toast t = Toast.makeText(this,"Holaa",
                        Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
                break;
            case R.id.simple2:
                Toast tx = Toast.makeText(this,"Abrir actividad",
                        Toast.LENGTH_LONG);
                tx.setGravity(Gravity.CENTER,0,0);
                tx.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
