package com.example.a0821petlight;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScrollActivity extends AppCompatActivity {

    private ImageView petImage, mapIcon, callIcon, lightbulbIcon;
    private TextView petName, petBreed, dateText;
    private Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        // Initialize UI components
        petImage = findViewById(R.id.petImage);
        mapIcon = findViewById(R.id.mapIcon);
        callIcon = findViewById(R.id.callIcon);
        lightbulbIcon = findViewById(R.id.lightbulbIcon);
        petName = findViewById(R.id.petName);
        petBreed = findViewById(R.id.petBreed);
        dateText = findViewById(R.id.dateText);
        shareButton = findViewById(R.id.shareButton);

        // Set up initial data (example)
        petName.setText("Buddy");
        petBreed.setText("Golden Retriever");
        dateText.setText("August 21, 2024");

        // Add listeners (example)
        shareButton.setOnClickListener(v -> {
            // Handle share button click
        });

        mapIcon.setOnClickListener(v -> {
            // Handle map icon click
        });

        callIcon.setOnClickListener(v -> {
            // Handle call icon click
        });

        lightbulbIcon.setOnClickListener(v -> {
            // Handle lightbulb icon click
        });
    }
}