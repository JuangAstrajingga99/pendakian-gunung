package com.atefs.pendakiangunung.Pendakian.jatim;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class p_butak extends AppCompatActivity {

    private CardView myCard, myCard2, myCard3, myCard4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_butak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.anim_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Butak");
        ImageView header = (ImageView) findViewById(R.id.header);
        myCard = (CardView) findViewById(R.id.mytxtCard);
        myCard2 = (CardView) findViewById(R.id.mytxtCard2);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
        }
        return true;
    }

    public void mycard(View view) {
        myCard.setVisibility((myCard.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
    }

    public void mycard2(View view) {
        myCard2.setVisibility((myCard2.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
    }
}

