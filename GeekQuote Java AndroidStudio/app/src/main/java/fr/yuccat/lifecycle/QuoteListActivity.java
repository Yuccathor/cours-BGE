package fr.yuccat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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


