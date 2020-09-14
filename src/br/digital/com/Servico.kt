package br.digital.com

class Servico(private var descricao: String, private var horas: Int, private var precoHoras: Double) : IRecebivel {

//    fun Servico(descricao: String, horas: Int, precoHoras: Double){
//        this.descricao = descricao
//        this.horas = horas
//        this.precoHoras = precoHoras
//    }

    override fun totalizarReceita(): Double{
        return precoHoras * horas
    }

    override fun toString(): String{
        return when (horas){
            1 -> "O serviço de $descricao foi executado em 1 hora por R$ $precoHoras/hora" +
                    "\nPreço total: R$ ${totalizarReceita()}"
            0 -> "Nenhum serviço foi executado"
            else -> "O serviço de $descricao foi executado em $horas horas por R$ $precoHoras/hora " +
                    "\nPreço total: R$ ${totalizarReceita()}"
        }
    }
}