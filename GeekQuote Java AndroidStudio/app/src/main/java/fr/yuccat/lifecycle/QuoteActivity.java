package fr.yuccat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class QuoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        // On récupére les extras ici (initialisations des données)
        Bundle extras = getIntent().getExtras();

        final int quoteIndex = extras.getInt(QuoteListActivity.QUOTE_INDEX);

        //Initialiser les composants graphique avec les bonnes infos (MISSION 6)
        TextView tv = findViewById(R.id.textViewQuoteSelected); // le texte de la quote on peut placer un final pour reutiliser la variable
        tv.setText(extras.getString(QuoteListActivity.QUOTE_TEXT));

        tv = findViewById(R.id.textViewDate); // Affichage du texte de la date
        Date date = (Date) extras.get(QuoteListActivity.QUOTE_DATE);
        tv.setText(date.toString());
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date = (Date) extras.get(QuoteListActivity.QUOTE_DATE);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(QuoteActivity.this, null, year, month, day);
                datePickerDialog.show();
            }
        });
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(extras.getInt(QuoteListActivity.QUOTE_RATING));

        // BOUTON OK
        Button button = findViewById(R.id.buttonQuoteOk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuoteActivity.this, "Quote noté", Toast.LENGTH_SHORT).show();
                // ETL - EXTRACT
                //  1- extraire  les infos de la textview et rating (composant graphique) avec findBy
                TextView tv = findViewById(R.id.textViewQuoteSelected);
                TextView textViewDate = findViewById(R.id.textViewDate);
                RatingBar ratingBar = findViewById(R.id.ratingBar);

                // ETL - TRANSFORM
                String quote = tv.getText().toString();
                String dateStr = textViewDate.getText().toString();
                // Date date = ; // TODO transformer la date qui est sous forme de string en Date Mission10 ?
                int rating = (int) ratingBar.getRating();

                // ETL - LOADING
                //  2- pour ramener le result avec un getIntent ?
                getIntent().putExtra(QuoteListActivity.QUOTE_TEXT, quote);
                getIntent().putExtra(QuoteListActivity.QUOTE_DATE, dateStr);
                getIntent().putExtra(QuoteListActivity.QUOTE_RATING, rating);

                // On valide
                setResult(RESULT_OK, getIntent());
                finish();
                // CF 03_formation_Android_Java_et_Kotlin.pdf page 13
            }
        });
        // BOUTON CANCEL
        button = findViewById(R.id.buttonQuoteCancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuoteActivity.this, "Quote non-noté", Toast.LENGTH_SHORT).show();
                setResult(RESULT_CANCELED);
                finish();
                // CF page 13

            }
        });
    }
}