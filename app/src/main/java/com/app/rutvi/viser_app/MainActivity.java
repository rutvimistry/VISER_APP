package com.app.rutvi.viser_app;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.app.rutvi.viser_app.models.SectionDataModel;
import com.app.rutvi.viser_app.models.SingleItemModel;
import com.app.rutvi.viser_app.adapters.RecyclerViewDataAdapter;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    Cursor c = null;

    public ArrayList<SectionDataModel> allSampleData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        allSampleData = new ArrayList<SectionDataModel>();

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("G PlayStore");

        }


        createDummyData();


        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);

        my_recycler_view.setHasFixedSize(true);

        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(this, allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);


    }

    public void createDummyData() {
        Intent intent = getIntent();
        String productDetails = intent.getExtras().getString("productDetails");
        System.out.println("productDetails aaaa dena: " + productDetails);
        SectionDataModel bw = new SectionDataModel();
        SectionDataModel nw = new SectionDataModel();
        SectionDataModel pw = new SectionDataModel();
        nw.setHeaderTitle("Nearby Location ");
        ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
        float miles = 01;
        int price = 100;
        for (int j = 0; j <= 5; j++) {
            singleItem.add(new SingleItemModel("Price " + j, "URL " + j, price, miles));
            //singleItem.add(new SingleItemModel("Price " + j, "URL " + j, price, miles));
        }
        pw.setHeaderTitle("Price Range");
        ArrayList<SingleItemModel> priceItem = new ArrayList<SingleItemModel>();
        for (int j = 0; j <= 5; j++) {
            priceItem.add(new SingleItemModel("Price " + j, "URL " + j, price, miles));
           // priceItem.add(new SingleItemModel("Price " + j, "URL " + j, price, miles));
        }
        bw.setHeaderTitle("Brand Wise");

        ArrayList<SingleItemModel> brandItem = new ArrayList<SingleItemModel>();
        for (int j = 0; j <= 5; j++) {
            brandItem.add(new SingleItemModel("Price " + j, "URL " + j, price, miles));
            //brandItem.add(new SingleItemModel("Price " + j, "URL " + j, price, miles));
        }

        nw.setAllItemsInSection(singleItem);
        pw.setAllItemsInSection(singleItem);
        bw.setAllItemsInSection(singleItem);

        allSampleData.add(nw);
        allSampleData.add(pw);
        allSampleData.add(bw);
    }
}
//    public void onClick(View v) {
//                DatabaseHelper myDbHelper = new DatabaseHelper(CopyingDBActivity.this);
//                try {
//                    myDbHelper.createDataBase();
//                } catch (IOException ioe) {
//                    throw new Error("Unable to create database");
//                }
//                try {
//                    myDbHelper.openDatabase();
//                } catch (SQLException sqle) {
//                    throw sqle;
//                }
//                Toast.makeText(CopyingDBActivity.this, "Success", Toast.LENGTH_SHORT).show();
//                c = myDbHelper.query("Bargain_List", null, null, null, null, null, null);
//                if (c.moveToFirst()) {
//                    do {
//                        Toast.makeText(CopyingDBActivity.this,
//                                "grp_id: " + c.getString(0) + "\n" +
//                                        "UPC14: " + c.getString(1) + "\n" +
//                                        "UPC12: " + c.getString(2) + "\n" +
//                                        "brand:  " + c.getString(3) +"\n"+
//                                        "name:  " + c.getString(4) +"\n"+
//                                        "Location:  " + c.getString(4) +"\n"+
//                                        "Price:  " + c.getString(4),
//                                Toast.LENGTH_LONG).show();
//                    } while (c.moveToNext());
//                }
//            }