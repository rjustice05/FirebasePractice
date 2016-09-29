package com.example.listdisplay.listiewforfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView1 = (ListView) findViewById(R.id.listView1);

        Article[] items = {
                new Article("https://en.wikipedia.org/wiki/Fibonacci_number", "Fibonacci Numbers", "Fibonacci Description"),
                new Article("https://en.wikipedia.org/wiki/Pi", "Pi", "Pi Description"),
                new Article("https://en.wikipedia.org/wiki/Graph_theory", "Graph Theory", "Graph Theory Description"),
                new Article("https://en.wikipedia.org/wiki/Discrete_mathematics", " Discrete Math", "Discrete Math Description"),
                new Article("https://en.wikipedia.org/wiki/Calculus", "Calculus", "Calculus Description"),
        };

        ArrayAdapter<Article> adapter = new ArrayAdapter<Article>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            }
        });

    }
    }
