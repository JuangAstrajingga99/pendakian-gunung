package com.atefs.pendakiangunung.detail;

public class DetailPeralatan extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.CollapsedAppBar);

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.nama_peralatan);
        collapsingToolbar.setTitle(places[postion % places.length]);

        TypedArray imagePeralatan = resources.obtainTypedArray(R.array.image_peralatan);
        ImageView imageperalatan = (ImageView) findViewById(R.id.images_peralatan);
        imageperalatan.setImageDrawable(imagePeralatan.getDrawable(postion % imagePeralatan.length()));

        String[] namaPeralatan = resources.getStringArray(R.array.nama_peralatan);
        TextView namaperalatan = (TextView) findViewById(R.id.nama_peralatan);
        namaperalatan.setText(namaPeralatan[postion % namaPeralatan.length]);

        String[] detailPeralatan = resources.getStringArray(R.array.informasi_peralatan);
        TextView detailperalatan = (TextView) findViewById(R.id.detail_peralatan);
        detailperalatan.setText(detailPeralatan[postion % detailPeralatan.length]);

        imagePeralatan.recycle();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            startActivity(new Intent(this,MainActivity3.class));
        }
        return true;
    }
}
