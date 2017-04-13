package com.app.rutvi.viser_app;

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
        SectionDataModel bw = new SectionDataModel();
        SectionDataModel nw = new SectionDataModel();
        SectionDataModel pw = new SectionDataModel();
        nw.setHeaderTitle("Nearby Location ");
        ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
        for (int j = 0; j <= 5; j++) {
            singleItem.add(new SingleItemModel("Item " + j, "URL " + j));
        }
        pw.setHeaderTitle("Price Range");
        ArrayList<SingleItemModel> priceItem = new ArrayList<SingleItemModel>();
        for (int j = 0; j <= 5; j++) {
            priceItem.add(new SingleItemModel("Item " + j, "URL " + j));
        }
        bw.setHeaderTitle("Brand Wise");

        ArrayList<SingleItemModel> brandItem = new ArrayList<SingleItemModel>();
        for (int j = 0; j <= 5; j++) {
            brandItem.add(new SingleItemModel("Item " + j, "URL " + j));
        }

        nw.setAllItemsInSection(singleItem);
        pw.setAllItemsInSection(singleItem);
        bw.setAllItemsInSection(singleItem);

        allSampleData.add(nw);
        allSampleData.add(pw);
        allSampleData.add(bw);
    }
}
