package com.atefs.pendakiangunung.detail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailGunungLuarJawa extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.nama_gunung_luar);
        collapsingToolbar.setTitle(places[postion % places.length]);

        TypedArray imageGunung = resources.obtainTypedArray(R.array.image_gunung_luar);
        ImageView imagegunung = (ImageView) findViewById(R.id.images);
        imagegunung.setImageDrawable(imageGunung.getDrawable(postion % imageGunung.length()));

        String[] namaGunung = resources.getStringArray(R.array.nama_gunung_luar);
        TextView namagunung = (TextView) findViewById(R.id.nama_gunung);
        namagunung.setText(namaGunung[postion % namaGunung.length]);

        String[] detailGunung = resources.getStringArray(R.array.deskripsi_gunung_luar);
        TextView detailgunung = (TextView) findViewById(R.id.detail_gunung);
        detailgunung.setText(detailGunung[postion % detailGunung.length]);

        String[] jalurGunung = resources.getStringArray(R.array.jalur_luar);
        TextView jalurgunung = (TextView) findViewById(R.id.jalur);
        jalurgunung.setText(jalurGunung[postion % jalurGunung.length]);

        String[] informasiGunung = resources.getStringArray(R.array.nama_gunung_luar);
        TextView informasigunung = (TextView) findViewById(R.id.informasi_gunung);
        informasigunung.setText("Informasi "+informasiGunung[postion % informasiGunung.length]);

        String[] detailInformasi = resources.getStringArray(R.array.informasi_gunung_luar);
        TextView detailinformasi = (TextView) findViewById(R.id.detail_informasi);
        detailinformasi.setText(detailInformasi[postion % detailInformasi.length]);

        imageGunung.recycle();
    }
}
