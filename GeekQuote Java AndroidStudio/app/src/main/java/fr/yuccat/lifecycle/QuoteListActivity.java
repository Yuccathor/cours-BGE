package fr.yuccat.lifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    private static final int QUOTE_ACTIVITY_CODE = 10;

    protected static final String QUOTE_TEXT = "QUOTE_TEXT";
    protected static final String QUOTE_DATE = "QUOTE_DATE";
    protected static final String QUOTE_RATING = "QUOTE_RATING";
    protected static final String QUOTE_INDEX = "QUOTE_INDEX";

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
                Intent intent = new Intent(QuoteListActivity.this, QuoteActivity.class);
                //startActivity(intent);
                Quote quote = QuoteListActivity.this.mesQuotes.get(i);
                intent.putExtra(QUOTE_TEXT, quote.getStrQuote());
                intent.putExtra(QUOTE_DATE, quote.getCreationDate());
                intent.putExtra(QUOTE_RATING, quote.getRating());
                intent.putExtra(QUOTE_INDEX, i);
                startActivityForResult(intent, QUOTE_ACTIVITY_CODE);
                // c'est ici qu'il faut mettre l'intent
            }
        });
    }


    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case QUOTE_ACTIVITY_CODE:
                manageQuoteActivityResult(resultCode, data);
                break;
            default:
                throw new UnsupportedOperationException("le retour d'activité n'est pas codé pour le request code 10" + requestCode);
        }
    }

    /**
     * on récupére le résultat de la sous activité QuoteACtivity (EVITE UN CODE TROP LONG)
     *
     * @param resultCode
     * @param data
     */
    private void manageQuoteActivityResult(int resultCode, Intent data) {
        switch (resultCode) {
            case RESULT_OK:
                // DATA.GETEXTRAS()
                Bundle extras = data.getExtras();
                String quoteStr = extras.getString(QuoteListActivity.QUOTE_TEXT);
                String date = extras.get(QuoteListActivity.QUOTE_DATE).toString();
                int rating = extras.getInt(QuoteListActivity.QUOTE_RATING);
                int index = extras.getInt(QuoteListActivity.QUOTE_INDEX);
                // on met à jours la arraylist
                Quote quote = Quote.create(quoteStr, rating, new Date());
                this.mesQuotes.set(index, quote);
                data.getExtras();
                // on récupere les infos depuis la quoteActivity
                // ...

                // on oublie pas de notifier les changements
                adapter.notifyDataSetChanged();
                break;

            case RESULT_CANCELED:
                Log.v(TAG, "non modifié");
                break;

        }
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


