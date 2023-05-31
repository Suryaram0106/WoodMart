package com.infobee.woodmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GreatDeals extends AppCompatActivity {


    RecyclerView rvGreatDeals;
    Button btnPayment;
    private DealsOrdersListAdapter dealsOrdersListAdapter;
    private List<Category> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.great_deals);

        rvGreatDeals = findViewById(R.id.rvGreatDeals);
        btnPayment = findViewById(R.id.btnPayment);

        Category category1 = new Category("Furniture","Dining Table","₹ 3500", R.drawable.image1);
        categoryList.add(category1);

        Category category2 = new Category("Sports Wear","Carrom Boards","₹ 3500",R.drawable.image2 );
        categoryList.add(category2);

        Category category3 = new Category("Ceiling wall panels","Wall Panels","₹ 3500",R.drawable.image3 );
        categoryList.add(category3);

        Category category4 = new Category("Furniture","Living Room Beds","₹ 3500", R.drawable.image4);
        categoryList.add(category4);

        Category category5 = new Category("Furniture","Dining Table","₹ 3500", R.drawable.image1);
        categoryList.add(category5);

        Category category6 = new Category("Sports Wear","Carrom Boards","₹ 3500",R.drawable.image2 );
        categoryList.add(category6);

        Category category7 = new Category("Ceiling wall panels","Wall Panels","₹ 3500",R.drawable.image3 );
        categoryList.add(category7);

        Category category8 = new Category("Furniture","Living Room Beds","₹ 3500", R.drawable.image4);
        categoryList.add(category8);




        rvGreatDeals.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        dealsOrdersListAdapter = new DealsOrdersListAdapter(categoryList);
        rvGreatDeals.setAdapter(dealsOrdersListAdapter);

        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChoosePayment.class);
                startActivity(intent);
            }
        });


    }
}