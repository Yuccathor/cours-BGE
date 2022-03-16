package fr.yuccat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

import model.Quote;

public class QuoteListActivity extends AppCompatActivity {

    private final static String TAG = QuoteListActivity.class.getCanonicalName();

    private final ArrayList<Quote> mesQuotes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] quotes = getResources().getStringArray(R.array.mes_quotes);
        // on récupére ce qu'on a déclaré dans array.xml grace aux ressources et son identifiant
        for (String quote : quotes) {
            this.addQuote(quote);

        }
        // Resources resources = getResources();{
        //String appName = resources.getString(R.string.app_name);
        //Log.v(TAG, resources.getString(R.string.app_name)+ " "+ R.string.app_name);
    }

    void addQuote(String quote) {
        Date creationDate = new Date();
        Quote q = Quote.create(quote, 0, creationDate);
        this.mesQuotes.add(q);
        Log.v(TAG, "quote ajoutée : " + q.getStrQuote());
        LinearLayout listQuotesWrapper = findViewById(R.id.ListQuoteWrapper);
        TextView tv = new TextView(this);
        // déclarer une nouvelle text view
        tv.setText(q.getStrQuote());
        // mettre le text view in the (DA)layout
        listQuotesWrapper.addView(tv);
        // ajouter le text view dans le layout

        //ALternance des couleurs
        int color;
        if (this.mesQuotes.size() % 2 == 0) {
            color = getResources().getColor(R.color.light_lightgray);
        } else {
            color = getResources().getColor(R.color.lightgray);
        }
        tv.setBackgroundColor(color);

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


