package com.example.maverick.uhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewProfileActivity extends AppCompatActivity {

    private CircleImageView civProfilePicture;
    private TextView tvProfileName;
    private TextView tvProfileOccupation;
    private Button btProfileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        civProfilePicture = findViewById(R.id.civ_vpProfilePicture);
        tvProfileName = findViewById(R.id.tv_vpProfileName);
        tvProfileOccupation = findViewById(R.id.tv_vpProfileOccupation);
        btProfileNumber = findViewById(R.id.bt_vpProfileNumber);
    }
}
