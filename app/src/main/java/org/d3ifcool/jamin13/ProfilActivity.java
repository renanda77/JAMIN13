package org.d3ifcool.jamin13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("Weight  :"));
        data.add(new Word("Genre   :"));
        data.add(new Word("Wake up :"));
        data.add(new Word("Sleep   :"));


        ListView listView = (ListView) findViewById(R.id.listProfil);
        WordAdapter wordAdapter = new WordAdapter(this, data);
        // wordAdapter.setBackgroundColor(R.color.category_phrases);
        listView.setAdapter(wordAdapter);
    }
}

