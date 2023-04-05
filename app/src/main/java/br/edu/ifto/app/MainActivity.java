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

        // Here, we have created new array list and added data to it
        ArrayList<Pessoa> pessoaArrayList = new ArrayList<Pessoa>();
        pessoaArrayList.add(new Pessoa("Charles Albert", 37, "Aluno"));
        pessoaArrayList.add(new Pessoa("Fulano", 20, "Professor"));
        pessoaArrayList.add(new Pessoa("Beltrano", 45, "Secretario"));
        pessoaArrayList.add(new Pessoa("Fulana", 30, "Professora"));

        // we are initializing our adapter class and passing our arraylist to it.
        PessoaAdapter pessoaAdapter = new PessoaAdapter(this, pessoaArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        pessoas.setLayoutManager(linearLayoutManager);
        pessoas.setAdapter(pessoaAdapter);
    }
}