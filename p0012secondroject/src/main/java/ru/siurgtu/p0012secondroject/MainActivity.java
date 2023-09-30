package ru.siurgtu.p0012secondroject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView myTextView;
    Button myButton;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        imageButton = findViewById(R.id.imageButton2);
        myButton.setOnClickListener(oMyButton);
    }

    View.OnClickListener oMyButton = new View.OnClickListener()
    {
        @Override
        public void onClick (View v)
        {
            myTextView.setText("Все ок");
            imageButton.setVisibility(View.VISIBLE);
        }
    };
}