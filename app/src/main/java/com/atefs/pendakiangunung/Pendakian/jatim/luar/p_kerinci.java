package com.atefs.pendakiangunung.Pendakian.jatim.luar;

public class p_kerinci extends AppCompatActivity {

    private CardView myCard, myCard2, myCard3, myCard4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pppp_kerinci);
        Toolbar toolbar = (Toolbar) findViewById(R.id.anim_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Kerinci");
        ImageView header = (ImageView) findViewById(R.id.header);
        myCard = (CardView) findViewById(R.id.mytxtCard);

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
}