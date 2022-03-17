package fr.yuccat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        // BOUTON OK
        Button button = (Button) findViewById(R.id.buttonQuoteOk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_OK);
                finish();
                Toast.makeText(QuoteActivity.this, "Quote noté", Toast.LENGTH_SHORT).show();

            }
        });
        // BOUTON CANCEL
        button = (Button) findViewById(R.id.buttonQuoteCancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
                Toast.makeText(QuoteActivity.this, "Quote non-noté", Toast.LENGTH_SHORT).show();

            }
        });
    }
}