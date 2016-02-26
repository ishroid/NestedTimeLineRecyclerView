package com.in.timelinenested;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.in.timelinenested.modals.DataModal;
import com.in.timelinenested.modals.Level;
import com.in.timelinenested.utils.ViewUtils;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(linearLayoutManager);

        //view line 1 is handled form xml no need to handle programmatically we are only handling line two and three
        ViewUtils.handleVerticalLines(findViewById(R.id.view_line_2), findViewById(R.id.view_line_3));


        RvAdapter rvAdapter = new RvAdapter(this);
        rvAdapter.addItem(new DataModal(Level.LEVEL_ONE,"India"));
            //Add Level 2 Item
            rvAdapter.addItem(new DataModal(Level.LEVEL_TWO,"Uttar Pradesh"));
                //Add Level 3 Item
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Lucknow"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Kanpur"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Bareilly"));

            //Add Level 2 Item
            rvAdapter.addItem(new DataModal(Level.LEVEL_TWO,"Tamil Nadu"));
                 //Add Level 3 Item
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Chennai"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Madurai"));


        rvAdapter.addItem(new DataModal(Level.LEVEL_ONE,"U.S."));
            //Add Level 2 Item
            rvAdapter.addItem(new DataModal(Level.LEVEL_TWO,"California"));
                //Add Level 3 Item
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Los Angeles"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"San Francisco"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Oakland"));

        rvAdapter.addItem(new DataModal(Level.LEVEL_ONE,"Netherlands"));
            //Add Level 2 Item
            rvAdapter.addItem(new DataModal(Level.LEVEL_TWO,"Drenthe"));
                //Add Level 3 Item
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Assen"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Emmen"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Hoogeveen"));

            //Add Level 2 Item
            rvAdapter.addItem(new DataModal(Level.LEVEL_TWO,"Flevoland"));
                //Add Level 3 Item
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Biddinghuizen"));
                rvAdapter.addItem(new DataModal(Level.LEVEL_THREE,"Emmeloord"));

        rv.setAdapter(rvAdapter);

    }
}
