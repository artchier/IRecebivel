package br.digital.com

fun main() {

    val registro = RegistroRecebimentos()
    val bicicleta = ItemVenda("bicicleta", 3, 754.00)

    val iFood = Servico("delivery do Ifood", 2, 15.02)

    val freelance = Servico("desenvolvimento de app bancário", 220, 250.0)

    registro.adicionarRecebimentos(bicicleta, iFood, freelance)
    registro.apresentarRecebimentos()
}