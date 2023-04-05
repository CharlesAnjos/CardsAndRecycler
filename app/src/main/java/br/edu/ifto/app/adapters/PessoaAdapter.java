package br.edu.ifto.app.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.edu.ifto.app.R;
import br.edu.ifto.app.entidades.Pessoa;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<Pessoa> pessoaArrayList;

    // Constructor
    public PessoaAdapter(Context context, ArrayList<Pessoa> pessoaArrayList) {
        this.context = context;
        this.pessoaArrayList = pessoaArrayList;
    }

    @Override
    public PessoaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.pessoa_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(PessoaAdapter.ViewHolder holder,
                                 int position) {
        // to set data to textview and imageview of each card layout
        Pessoa model = pessoaArrayList.get(position);
        holder.nome_pessoa.setText(model.getNome());
        holder.idade_pessoa.setText(String.format("%d", model.getIdade()));
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return pessoaArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nome_pessoa;
        private final TextView idade_pessoa;

        public ViewHolder(View itemView) {
            super(itemView);
            nome_pessoa = itemView.findViewById(R.id.nome_pessoa);
            idade_pessoa = itemView.findViewById(R.id.idade_pessoa);
        }
    }
}