package com.example.blueprints;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(android.view.View v)
    {
        EditText speed_input = findViewById(R.id.speed);
        double speed_num = Integer.parseInt(speed_input.getText().toString());

        EditText time_input = findViewById(R.id.time);
        double time_num = Double.parseDouble(time_input.getText().toString());
        
        double distance = speed_num * time_num;
        EditText distance_input = findViewById(R.id.distance);
        String distance_str = Double.toString(distance);
        distance_input.setText(distance_str);
    }
}
