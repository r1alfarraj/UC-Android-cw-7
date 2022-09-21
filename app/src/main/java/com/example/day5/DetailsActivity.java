package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView nametext = findViewById(R.id.textViewnamed);
        TextView nametext2 = findViewById(R.id.textView3);
        TextView pricetext = findViewById(R.id.textViewpriced);
        ImageView img = findViewById(R.id.imageViewDetails);



        Bundle bundle = getIntent().getExtras();

        BookShop sentBook = (BookShop) bundle.getSerializable("BookShop");

        nametext.setText(sentBook.getBookName());
        nametext2.setText(sentBook.getBookType());

      //  img.setImageResource(sentBook.getBookImg());
        pricetext.setText(sentBook.getPhonePrice() +" KD");

        Picasso.with(this).load(sentBook.getBookImg()).into(img);
    }
}