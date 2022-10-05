package com.example.doesaude

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doesaude.adapter.PostagemAdapter
import com.example.doesaude.databinding.FragmentListBinding
import com.example.doesaude.model.Postagem
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val listPostagem = listOf(
            Postagem(
                imagem = "dipirona-monoidratada-1g-com-10-comprimidos-generico-prati-donaduzzi#&gid=1&pid=1",
                titulo = "Dipirona Monoidratada",
                descricao = "Serve para praticamente tudo!",
                categoria = "medicamentos"
            ),
            Postagem(
                imagem = "dipirona-monoidratada-1g-com-10-comprimidos-generico-prati-donaduzzi#&gid=1&pid=1",
                titulo = "Dipirona Monoidratada",
                descricao = "Serve para praticamente tudo!",
                categoria = "medicamentos"
            ),
            Postagem(
                imagem = "dipirona-monoidratada-1g-com-10-comprimidos-generico-prati-donaduzzi#&gid=1&pid=1",
                titulo = "Dipirona Monoidratada",
                descricao = "Serve para praticamente tudo!",
                categoria = "medicamentos"
            )
        )


        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        //CONFIGURAÇÃO DO RECYCLEVIEW
        val adapter = PostagemAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)


        adapter.setList(listPostagem)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }



        return binding.root
    }
}