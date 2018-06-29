package com.example.maverick.uhack;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.maverick.uhack.adapters.RecyclerViewAdapter_MyPostings;
import com.example.maverick.uhack.beans.Post;

import java.util.ArrayList;
import java.util.List;

public class MyPostings extends AppCompatActivity {

    List<Post> listPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listPost = new ArrayList<>();

        listPost.add(new Post("11/23/18", "Jan Joseph Abutog", "FARMER", 70000.00,21000.00, "11/23/19",15.0));
        listPost.add(new Post("01/30/18","Darlene Psalm Marpa", "FARMER", 50000.00,15000.00, "01/30/19",10.0));
        listPost.add(new Post("03/15/18", "Maverick Stevens Ng", "INVESTOR", 25000.00, 1000.00, "08/19/19", 11.0));
        listPost.add(new Post("03/15/18", "John Paul San Pedro", "INVESTOR", 10000.00,7500.00, "10/01/19", 20.0));
        listPost.add(new Post("08/19/19", "Rofi Emmanuelle Santos", "FARMER", 100000.00,90000.00, "08/19/19", 18.0));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.postRecyclerView);
        RecyclerViewAdapter_MyPostings recyclerViewAdapter = new RecyclerViewAdapter_MyPostings(this, listPost);

    }

}