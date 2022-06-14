package com.mohammedev.c7_cw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PokemonAdapter extends ArrayAdapter<Pokemon> {
    List<Pokemon> pokemonList;
    public PokemonAdapter(@NonNull Context context, int resource, @NonNull List<Pokemon> objects) {
        super(context, resource, objects);
        pokemonList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);

        Pokemon currentPokemon = pokemonList.get(position);

        TextView pokemonNameTxt = view.findViewById(R.id.pokemonNameTxt);

        pokemonNameTxt.setText(currentPokemon.getPokemonName());


        return view;
    }
}
