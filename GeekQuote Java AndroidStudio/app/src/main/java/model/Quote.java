package model;

import java.util.Date;

public class Quote {
    private String strQuote;

    private int rating;

    private Date creationDate;

    public Quote() {
    }

    public String getStrQuote() {
        return strQuote;
    }

    public void setStrQuote(String strQuote) {
        this.strQuote = strQuote;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public final static Quote create(String strQuote, int rating, Date creationDate) {
        Quote quote = new Quote();
        quote.setStrQuote(strQuote);
        quote.setRating(rating);
        quote.setCreationDate(creationDate);
        return quote;
    }
}
