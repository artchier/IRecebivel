package br.digital.com

class ItemVenda(private var produto: String, private var qtde: Int, private var valor: Double) : IRecebivel {

//    fun itemVenda(produto: String, qtde: Int, valor: Double){
//        this.produto = produto
//        this.qtde = qtde
//        this.valor = valor
//    }
    override fun totalizarReceita(): Double{
        return qtde * valor
    }

    override fun toString(): String{
        return when (qtde){
            1 -> "1 $produto foi comprado(a) pelo valor de R$ $valor" +
                    "\nPreço total: R$ ${totalizarReceita()}"
            0 -> "Nenhum produto foi comprado"
            else -> "$qtde ${produto}s foram comprados(as) pelo valor de R$ $valor" +
                    "\nPreço total: R$ ${totalizarReceita()}"
        }
    }
}