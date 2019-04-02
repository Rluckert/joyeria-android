package com.example.my_jewelry;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double precioTotal;

    private Spinner typesJewels;
    private Spinner materialsOne;
    private Spinner materialsTwo;
    private TextView totalPrice;
    private Resources resources;

    private ArrayAdapter<String> adapterOne;
    private ArrayAdapter<String> adapterTwo;
    private String[] optionsTypes;
    private String[] optionsMaterials;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalPrice = (TextView)findViewById(R.id.totalPrice);

        //Capturando Spinners
        typesJewels = (Spinner)findViewById(R.id.spinnerTypes);
        materialsOne = (Spinner)findViewById(R.id.spinnerMaterials1);
        materialsTwo = (Spinner)findViewById(R.id.spinnerMaterials2);


        //Cargando array de strings a los spinners
        optionsTypes = this.getResources().getStringArray(R.array.type_jewels);
        adapterOne = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, optionsTypes);
        typesJewels.setAdapter(adapterOne);

        optionsMaterials = this.getResources().getStringArray(R.array.materials);
        adapterTwo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, optionsMaterials);
        materialsOne.setAdapter(adapterTwo);
        materialsTwo.setAdapter(adapterTwo);
    }

    public void showTotal(View v){
        int positionType = typesJewels.getSelectedItemPosition();
        int positionMaterialsOne = materialsOne.getSelectedItemPosition();
        int positionMaterialsTwo = materialsTwo.getSelectedItemPosition();


        precioTotal = Order.CalculateTotal(positionType, positionMaterialsOne, positionMaterialsTwo);
        totalPrice.setText("$ "+precioTotal);

    }

}
