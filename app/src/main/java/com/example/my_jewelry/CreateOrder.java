package com.example.my_jewelry;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class CreateOrder extends AppCompatActivity {
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

    private ArrayList<OrderJewel> orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_order);
        TextView txtView = (TextView) findViewById(R.id.app_name);
        txtView.setGravity(Gravity.CENTER_HORIZONTAL);

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

        resources = this.getResources();
        orders = Data.get();
    }

    public void saveOrder(View view){
        //Capturo valores de los spinners
        int positionType = typesJewels.getSelectedItemPosition();
        int positionMaterialsOne = materialsOne.getSelectedItemPosition();
        int positionMaterialsTwo = materialsTwo.getSelectedItemPosition();

        String[]  types = {"Pulsera", "Cadena"};
        String[] materials = {"Plata", "Acero", "Oro", "Rubí","Cuarzo"};
        String id;

        id = (orders.size() + 1) + "";
        precioTotal = Order.CalculateTotal(positionType, positionMaterialsOne, positionMaterialsTwo);

        OrderJewel oj = new OrderJewel(id, types[positionType], materials[positionMaterialsOne],
                materials[positionMaterialsTwo], precioTotal);
        oj.saveOrder();

        totalPrice.setText("$ "+precioTotal);
        Toast.makeText(this, R.string.done, Toast.LENGTH_LONG).show();

    }
}
