package br.edu.ifto.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import br.edu.ifto.app.adapters.PessoaAdapter;
import br.edu.ifto.app.entidades.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView pessoas = findViewById(R.id.pessoasRecycler);

        ArrayList<Pessoa> pessoaArrayList = new ArrayList<Pessoa>();
        pessoaArrayList.add(new Pessoa("Charles Albert", 37, "Aluno"));
        pessoaArrayList.add(new Pessoa("Fulano", 20, "Professor"));
        pessoaArrayList.add(new Pessoa("Beltrano", 45, "Secretario"));
        pessoaArrayList.add(new Pessoa("Fulana", 30, "Professora"));

        PessoaAdapter pessoaAdapter = new PessoaAdapter(this, pessoaArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        pessoas.setLayoutManager(linearLayoutManager);
        pessoas.setAdapter(pessoaAdapter);
    }
}