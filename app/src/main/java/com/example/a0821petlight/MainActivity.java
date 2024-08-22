package com.example.a0821petlight;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

  private ActivityResultLauncher<Intent> intentActivityResultLauncher;
  //    private ImageView petImage, mapIcon, callIcon, lightbulbIcon;
//    private TextView petName, petBreed, dateText;
//    private Button shareButton;
//
  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
      Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      return insets;
    });

    intentActivityResultLauncher = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
        new ActivityResultCallback<ActivityResult>() {
          @Override
          public void onActivityResult(ActivityResult result) {
            // 寫另一個Activity回傳後, 得到回傳的資料之後的方法
            if (result.getData() != null && result.getResultCode() == Activity.RESULT_OK) {
//              bmi = result.getData().getDoubleExtra("BMI", -1);


            }
          }
        }
    );
  }
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Initialize UI components
//        petImage = findViewById(R.id.petImage);
//        mapIcon = findViewById(R.id.mapIcon);
//        callIcon = findViewById(R.id.callIcon);
//        lightbulbIcon = findViewById(R.id.lightbulbIcon);
//        petName = findViewById(R.id.petName);
//        petBreed = findViewById(R.id.petBreed);
//        dateText = findViewById(R.id.dateText);
//        shareButton = findViewById(R.id.shareButton);
//
//        // Set up initial data (example)
//        petName.setText("Buddy");
//        petBreed.setText("Golden Retriever");
//        dateText.setText("August 21, 2024");
//
//        // Add listeners (example)
//        shareButton.setOnClickListener(v -> {
//            // Handle share button click
//        });
//
//        mapIcon.setOnClickListener(v -> {
//            // Handle map icon click
//        });
//
//        callIcon.setOnClickListener(v -> {
//            // Handle call icon click
//        });
//
//        lightbulbIcon.setOnClickListener(v -> {
//            // Handle lightbulb icon click
//        });
//    }


    public void gotoScroll(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        intentActivityResultLauncher.launch(intent);

    }
}


