package com.atefs.pendakiangunung.detail;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.atefs.pendakiangunung.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DetailGunungJabar extends AppCompatActivity {

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
        String[] places = resources.getStringArray(R.array.nama_gunung_jabar);
        collapsingToolbar.setTitle(places[postion % places.length]);

        TypedArray imageGunung = resources.obtainTypedArray(R.array.image_gunung_jabar);
        ImageView imagegunung = (ImageView) findViewById(R.id.images);
        imagegunung.setImageDrawable(imageGunung.getDrawable(postion % imageGunung.length()));

        String[] namaGunung = resources.getStringArray(R.array.nama_gunung_jabar);
        TextView namagunung = (TextView) findViewById(R.id.nama_gunung);
        namagunung.setText(namaGunung[postion % namaGunung.length]);

        String[] detailGunung = resources.getStringArray(R.array.deskripsi_gunung_jabar);
        TextView detailgunung = (TextView) findViewById(R.id.detail_gunung);
        detailgunung.setText(detailGunung[postion % detailGunung.length]);

        String[] jalurGunung = resources.getStringArray(R.array.jalur_jabar);
        TextView jalurgunung = (TextView) findViewById(R.id.jalur);
        jalurgunung.setText(jalurGunung[postion % jalurGunung.length]);

        String[] informasiGunung = resources.getStringArray(R.array.nama_gunung_jabar);
        TextView informasigunung = (TextView) findViewById(R.id.informasi_gunung);
        informasigunung.setText("Informasi "+informasiGunung[postion % informasiGunung.length]);

        String[] detailInformasi = resources.getStringArray(R.array.informasi_gunung_jabar);
        TextView detailinformasi = (TextView) findViewById(R.id.detail_informasi);
        detailinformasi.setText(detailInformasi[postion % detailInformasi.length]);

        imageGunung.recycle();
    }
}

