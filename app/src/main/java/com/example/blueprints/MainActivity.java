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
        String speed_str = speed_input.getText().toString();
        int speed_num = Integer.parseInt(speed_str);
//        System.out.println(speed_str);

        EditText time_input = findViewById(R.id.time);
        String time_str = time_input.getText().toString();
        int time_num = Integer.parseInt(time_str);
//        System.out.println(time_str);
//
        int distance = speed_num * time_num;
//        System.out.println(distance);
        EditText distance_input = findViewById(R.id.distance);
        String distance_str = Integer.toString(distance);
        distance_input.setText(distance_str);
    }
}







//package com.example.blueprints;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}