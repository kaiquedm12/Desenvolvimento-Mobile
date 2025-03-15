package com.example.lojinha.model

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Produto (
    val id: Int,
    val nome: String,
    var preco: Double,
    var estoque: Int
) {
    @Preview(showBackground = true)
    @Composable
    fun exibirDetalhes(){
        Text(
            text = "ID: $id Nome: $nome Preço: $preco Estoque: $estoque"
        )
    }



}