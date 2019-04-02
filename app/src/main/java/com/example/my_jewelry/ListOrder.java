package com.example.my_jewelry;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListOrder extends AppCompatActivity {
    private ListView listView;
    private ArrayList<OrderJewel> orders;
    private ArrayList<String> orderNames;
    private TextView txtNoResults;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_list);

        listView = (ListView) findViewById(R.id.lvorders);
        txtNoResults = (TextView)findViewById(R.id.txtNoOrders);
        orders = Data.get();
        orderNames = new ArrayList<String>();

        txtNoResults.setVisibility(View.VISIBLE);
        listView.setVisibility(View.INVISIBLE);

        if (orders.size() > 0) {
            listView.setVisibility(View.VISIBLE);
            txtNoResults.setVisibility(View.INVISIBLE);

            for (int i = 0; i < orders.size(); i++) {
                orderNames.add(orders.get(i).getTypeJewel() + "  +  " + orders.get(i).getMaterial() + "  + Piedra: " +
                orders.get(i).getRock() + "    Total: $"+orders.get(i).getTotalOrder());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, orderNames);
        listView.setAdapter(adapter);


    }

}
