package model;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import fr.yuccat.lifecycle.QuoteListActivity;
import fr.yuccat.lifecycle.R;

public class QuoteListAdapter extends BaseAdapter {

    private final ArrayList<Quote> mesQuotes;

    private final QuoteListActivity activity;

    public QuoteListAdapter(ArrayList<Quote> mesQuotes, QuoteListActivity activity) {
        this.mesQuotes = mesQuotes;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return this.mesQuotes.size();
        // retourne le nb d'element
    }

    @Override
    public Object getItem(int i) {
        return this.mesQuotes.get(i);
        // retourne l'element à afficher
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //        // LinearLayout listQuotesWrapper = findViewById(R.id.ListQuoteWrapper);
        TextView tv = new TextView(this.activity);
        tv.setText(this.mesQuotes.get(i).getStrQuote());
        int color;
        if (getCount() % 2 == 0) {
            color = this.activity.getResources().getColor(R.color.light_lightgray);
        } else {
            color = this.activity.getResources().getColor(R.color.lightgray);
        }
        tv.setBackgroundColor(color);
        return tv;
    }
}
