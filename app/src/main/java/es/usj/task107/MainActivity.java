package es.usj.task107;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] paises={"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Perú", "Trinidad y Tobago", "Surinam", "Uruguay", "Venezuela"};
    private String[] habitantes={"44 494 502 ","11 217 864","208 385 000","17 574 003","50 001 971", "16 815 320","801 193", "7 052 983", "32 162 184", "1 380 056", "551 000", "3 290 454", "31 828 000"};

    TextView tvHabitantes;
    ListView lvPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHabitantes = findViewById(R.id.tvHabitantes);
        lvPaises= findViewById(R.id.lvPaises);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lvPaises.setAdapter(adapter);

        lvPaises.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tvHabitantes.setText("La población de "+ lvPaises.getItemAtPosition(i) + " es de: "+ habitantes[i].replace(" ",",")+ " habitantes.");
            }
        });
    }
}
