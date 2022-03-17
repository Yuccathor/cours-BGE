package fr.yuccat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

import model.Quote;
import model.QuoteListAdapter;

public class QuoteListActivity extends AppCompatActivity {

    private final static String TAG = QuoteListActivity.class.getCanonicalName();

    private final ArrayList<Quote> mesQuotes = new ArrayList<>();

    private QuoteListAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new QuoteListAdapter(this.mesQuotes, this);
        String[] quotes = getResources().getStringArray(R.array.mes_quotes);
        // on récupére ce qu'on a déclaré dans array.xml grace aux ressources et son identifiant
        for (String quote : quotes) {
            this.addQuote(quote);

        }
    }

    void addQuote(String quote) {
        Date creationDate = new Date();
        Quote q = Quote.create(quote, 0, creationDate);
        this.mesQuotes.add(q);
        this.adapter.notifyDataSetChanged();

        Button button = (Button) findViewById(R.id.buttonAdd);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "A clickay!");
                Toast.makeText(QuoteListActivity.this, "A clickay!", Toast.LENGTH_SHORT).show();
                // 1 récupérer la text view avec son ID
                EditText et = (EditText) findViewById(R.id.EditTextQuote);
                String newQuote = et.getText().toString();

                if (newQuote.isEmpty()) {
                    Toast.makeText(QuoteListActivity.this, "La quote est vide", Toast.LENGTH_SHORT).show();
                    return; // Permet de casser la fonction et de sortir ici dans exécuter la suite
                } else if (newQuote.equals(getResources().getString(R.string.newQuote))) {
                    Toast.makeText(QuoteListActivity.this, "La quote n'est pas changé", Toast.LENGTH_SHORT).show();
                    return; // Permet de casser la fonction et de sortir ici dans exécuter la suite
                }

                // 2 extraire le texte dans la text view
                // 3 ajouter la quote
                addQuote(newQuote);
            }
        }));
        // La listView va utiliser notre QuoteListAdapter comme source de
        // de données pour l'affichage
        ListView listView = findViewById(R.id.listViewQuotes);
        QuoteListAdapter adapter = new QuoteListAdapter(this.mesQuotes, this);
        listView.setAdapter(this.adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                // Log.v(TAG, i + " " + l);
                Intent ratingQuote = new Intent(QuoteListActivity.this, QuoteActivity.class);
                startActivityForResult(ratingQuote, QUOTE_ACTIVITY_quote);
                // c'est ici qu'il faut mettre l'intent
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
    }
}


