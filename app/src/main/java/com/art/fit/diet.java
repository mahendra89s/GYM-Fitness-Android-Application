package com.art.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class diet extends AppCompatActivity {
    Button button9,button10,button11,button12,button7,button8;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        diet.this);
                builder.setTitle("Keto Diet Plan");
                builder.setMessage("Breakfast: Avocado, eggs, yoghurt, nuts\n" +
                        "Lunch: Tuna, chicken, cheese, salad\n" +
                        "Dinner: Salmon, spinach, broccoli, zucchini\n");
                builder.setPositiveButton("Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"Keto Diet Plan",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.show();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        diet.this);
                builder.setTitle("Vegan Diet Plan");
                builder.setMessage("Breakfast: Banana, mushroom, sweet potato, avocado\n" +
                        "Lunch: Lentils, cauliflower, beans, tofu\n" +
                        "Dinner: Pears, nuts, oats, granola\n");
                builder.setPositiveButton("Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"Vegan Diet Plan",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.show();

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        diet.this);
                builder.setTitle("Low-carb Diet Plan");
                builder.setMessage("Breakfast: Shakshuka, spinach, eggs, berries\n" +
                        "Lunch: Salad, soup, beans, cauliflower\n" +
                        "Dinner: Salmon, chicken, quinoa, tomato\n");
                builder.setPositiveButton("Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"Low-carb Diet Plan",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.show();

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        diet.this);
                builder.setTitle("Paleo Diet Plan");
                builder.setMessage("Breakfast: Eggs, veggies, fruits, meat\n" +
                        "Lunch: Sandwich, steak, salad, nuts\n" +
                        "Dinner: Baked, fried meat, veggies\n");
                builder.setPositiveButton("Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"Paleo Diet Plan",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.show();

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        diet.this);
                builder.setTitle("DASH Diet Plan");
                builder.setMessage("Breakfast: Bread, cereals, veggies, fruits\n" +
                        "Lunch: Nuts, lentils, chicken, tuna\n" +
                        "Dinner: Pasta, broccoli, rice, squash\n");
                builder.setPositiveButton("Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"DASH Diet Plan",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.show();

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        diet.this);
                builder.setTitle("Weight Watchers’ Diet Plan");
                builder.setMessage("Breakfast: Berries, oats, cereals, fruits\n" +
                        "Lunch: Salad, eggs, chickpea, tuna\n" +
                        "Dinner: Pasta, beans, brown rice, steak\n");
                builder.setPositiveButton("Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"Weight Watchers’ Diet Plan",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.show();

            }
        });
    }
}