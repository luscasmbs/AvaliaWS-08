package br.senai.avaliaws08.service

import br.senai.avaliaws08.model.EntregaTecnica
import br.senai.avaliaws08.model.Penalidade

class RegraReadme: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (!entrega.possuiReadme){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Entrega sem README técnico",
                    pontosPerdidos = 5
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}

class RegraCommits: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (entrega.qntCommits < 3){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Entrega com menos de 3 commits",
                    pontosPerdidos = 10
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}

class RegraCheckList: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (!entrega.possuiCheck){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Entrega sem checklist",
                    pontosPerdidos = 10
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}

class RegraEvidencias: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (!entrega.possuiEvidencia){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Entrega sem evidências",
                    pontosPerdidos = 15
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}

class RegraItemFuncional: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (!entrega.possuiItemFuncional){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Entrega sem item funcional",
                    pontosPerdidos = 20,
                    motivoCritico = true
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}

class RegraApresentacao: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (!entrega.realizouApresentacao){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Não foi realizado uma apresentação técnica",
                    pontosPerdidos = 10
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}



class RegraTempoEntrega: RegraAvaliacao {
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if (entrega.tempoEntrega.minutos > 240){
            ResultadoRegra(
                penalidade = Penalidade(
                    descricao = "Tempo de entrega acima de 240 minutos",
                    pontosPerdidos = 5
                )
            )
        } else {
            ResultadoRegra()
        }
    }
}


class RegraCorrecao: RegraAvaliacao{
    override fun avaliar(entrega: EntregaTecnica): ResultadoRegra {
        return if(!entrega.corrigiuErro){
            ResultadoRegra(
               pendencia = "Não houve correção ao vivo"
            )
        } else {
            ResultadoRegra()
        }
    }
}

