package br.digital.com

class RegistroRecebimentos {

    var registroRecebimentos = mutableListOf<IRecebivel>()

    fun adicionarRecebimentos(vararg r: IRecebivel){
        registroRecebimentos.addAll(r)
    }

    fun apresentarRecebimentos(){
        registroRecebimentos.forEach {
            println(it.toString())
        }
    }
}