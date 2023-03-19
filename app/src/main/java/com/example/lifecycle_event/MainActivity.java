package com.example.lifecycle_event;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import org.jetbrains.annotations.NonNls;

public class MainActivity extends AppCompatActivity {
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lifecycle", "Oncreate event called");
        userName = findViewById(R.id.editTextTextPersonName);

        if(savedInstanceState !=null){
            String name = savedInstanceState.getString("name");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "OnStart event called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "OnStop event called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "OnDestroy event called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "OnPause event called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "OnResume event called");
    }

    @Override
    public  void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle", "onSaveInstance event called");
        outState.putString("name", userName.getText().toString());
    }
}