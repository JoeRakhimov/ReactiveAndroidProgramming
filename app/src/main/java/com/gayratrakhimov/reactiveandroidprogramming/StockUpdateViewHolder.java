package com.gayratrakhimov.reactiveandroidprogramming;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.stock_item_symbol)
    TextView stockSymbol;

    @BindView(R.id.stock_item_date)
    TextView date;

    @BindView(R.id.stock_item_price)
    TextView price;

    public StockUpdateViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }

    private static final NumberFormat PRICE_FORMAT = new DecimalFormat("#0.00");

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol.setText(stockSymbol);
    }

    public void setPrice(BigDecimal price) {
        this.price.setText(PRICE_FORMAT.format(price.floatValue()));
    }

    public void setDate(String date) {
        this.date.setText(date);
    }

}