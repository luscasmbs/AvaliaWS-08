package br.senai.avaliaws08.model

data class TempoEntrega(
    val minutos: Int
){
    init {
        require(minutos>0){
            "O tempo de entrega precisa ser maior que 0"
        }
    }
}
