package com.nikki.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private String[] list = new String[]{"Materi","Soal","Video Youtube","Exit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.ListMenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        if (list[position].equals("Materi")){
            intent = new Intent(this, Materi.class);
            startActivity(intent);
        }else if (list[position].equals("Soal")){
            intent = new Intent(this, Soal.class);
            startActivity(intent);

        }else if (list[position].equals("Video Youtube")){
            intent = new Intent(this, listVideo.class);
            startActivity(intent);
        }else if (list[position].equals("Exit")){
            finish();
        }

    }
}
