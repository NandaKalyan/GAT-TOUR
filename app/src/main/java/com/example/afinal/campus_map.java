package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.concurrent.LinkedTransferQueue;

public class campus_map extends AppCompatActivity {

    ImageButton i1,i2,i3,i4,i5,i6;
    Button n1,n2,n3,n4,n5,n6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_map);

        i1 = findViewById(R.id.imageButton5);
        i2 = findViewById(R.id.imageButton8);
        i3 = findViewById(R.id.imageButton4);
        i4 = findViewById(R.id.imageButton7);
        i5 = findViewById(R.id.imageButton6);
        i6 = findViewById(R.id.imageButton9);

        n1 = findViewById(R.id.button18);
        n2 = findViewById(R.id.button23);
        n3 = findViewById(R.id.button22);
        n4 = findViewById(R.id.button20);
        n5 = findViewById(R.id.button21);
        n6 = findViewById(R.id.button19);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent a = new Intent(campus_map.this,xerox.class);
            startActivity(a);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,ped_room.class);
                startActivity(a);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,ground.class);
                startActivity(a);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,canteen.class);
                startActivity(a);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,main_building.class);
                startActivity(a);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,civil_block.class);
                startActivity(a);
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,xerox.class);
                startActivity(a);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,ped_room.class);
                startActivity(a);
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,ground.class);
                startActivity(a);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,canteen.class);
                startActivity(a);
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,main_building.class);
                startActivity(a);
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(campus_map.this,civil_block.class);
                startActivity(a);
            }
        });
    }
}