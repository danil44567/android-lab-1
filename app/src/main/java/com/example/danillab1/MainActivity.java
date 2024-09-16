package com.example.danillab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private TextView group;
    private ImageView btr;
    private Button hideBtn;

    private boolean isVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        group = findViewById(R.id.group);
        btr = findViewById(R.id.imageView);

        hideBtn = findViewById(R.id.button);

        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isVisible = !isVisible;
                int visible = isVisible ? View.VISIBLE : View.INVISIBLE;
                name.setVisibility(visible);
                group.setVisibility(visible);
                btr.setVisibility(visible);
            }
        });
    }
}