package com.example.maverick.uhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewPostFarmerActivity extends AppCompatActivity {

    private TextView tvTitle;
    private TextView tvDescription;
    private TextView tvMoneyNeeded;
    private TextView tvReturnDate;
    private TextView tvInterest;
    private CircleImageView civPosterImage;
    private TextView tvPosterName;
    private TextView tvPosterLocation;
    private Button btPosterNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post_farmer);

        tvTitle = findViewById(R.id.tv_avpTitle);
        tvDescription = findViewById(R.id.tv_avpDescription);
        tvMoneyNeeded = findViewById(R.id.tv_avpMoneyNeeded);
        tvReturnDate = findViewById(R.id.tv_avpReturnDate);
        tvInterest = findViewById(R.id.tv_avpInterest);
        civPosterImage = findViewById(R.id.civ_avpPosterImage);
        tvPosterName = findViewById(R.id.tv_avpPosterName);
        tvPosterLocation = findViewById(R.id.tv_avpPosterLocation);
        btPosterNumber = findViewById(R.id.bt_apvAccept);

        btPosterNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO some stuff
            }
        });
    }
}
