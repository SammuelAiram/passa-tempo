package com.example.passatempo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class LIstaDeLivrosAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Livro> livros;
    private ArrayList<Livro> lista;

    public LIstaDeLivrosAdapter(Context context, List<Livro> livros) {
        this.context = context;
        this.livros = livros;
        layoutInflater = LayoutInflater.from(context);
        lista = new ArrayList<>();
        lista.addAll(livros);
    }

    @Override
    public int getCount() {
        return livros.size();
    }

    @Override
    public Object getItem(int position) {
        return livros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
