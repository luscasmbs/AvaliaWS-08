# AvaliaWS 08

Aplicativo Android desenvolvido em Kotlin com Jetpack Compose e Material 3 para realizar a avaliação técnica de competidores em treinamento para a ocupação 08 — Desenvolvimento de Aplicativos Móveis.

O projeto atende ao briefing da Semana 06 — POO intermediária e modelagem de domínio, com foco na aplicação de `data class`, `sealed class`, interfaces, composição, validadores, objetos de valor, regras de negócio e separação entre modelo, serviço, validação e interface.

O aplicativo permite cadastrar competidores, registrar entregas técnicas, aplicar automaticamente regras de avaliação, calcular a nota final, classificar os participantes e apresentar relatórios, ranking e resumo de penalidades.

## Como executar

1. Abra o projeto no Android Studio em uma versão estável.
2. Aguarde o Sync do Gradle finalizar.
3. Selecione um emulador ou dispositivo Android.
4. Execute o aplicativo pelo botão Run do Android Studio.

Execução pelo terminal no Windows:

```powershell
$env:JAVA_HOME='C:\Program Files\Android\Android Studio\jbr'
.\gradlew.bat assembleDebug
```

Para instalar e executar pelo Android Studio, certifique-se de que:

* o JDK esteja configurado corretamente;
* o Gradle tenha sido sincronizado;
* exista um emulador Android disponível;
* o dispositivo selecionado seja compatível com o `minSdk` do projeto.

## Objetivo do projeto

O AvaliaWS 08 funciona como um motor de regras para avaliação de competidores.

O instrutor pode cadastrar os participantes e registrar informações sobre suas entregas técnicas. A partir desses dados, o sistema aplica regras independentes, calcula penalidades, identifica pendências e determina a classificação final do competidor.

Todos os dados são mantidos em memória. Nesta etapa do projeto, não são utilizados banco de dados, API externa ou outro mecanismo de persistência.

## Funcionalidades previstas

* Tela inicial com o título `AvaliaWS 08`.
* Subtítulo `Motor de Regras para Avaliação de Competidores`.
* Exibição do total de competidores.
* Exibição do total de entregas registradas.
* Exibição do total de competidores avaliados.
* Contadores de aprovados, reprovados e pendentes.
* Cadastro de competidores.
* Validação dos dados do competidor.
* Bloqueio de identificadores duplicados.
* Lista de competidores cadastrados.
* Registro de entregas técnicas.
* Validação da nota, quantidade de commits e tempo de entrega.
* Aplicação automática das regras de avaliação.
* Cálculo da nota final.
* Identificação de penalidades e pendências.
* Relatório individual por competidor.
* Ranking ordenado dos competidores.
* Resumo geral das penalidades aplicadas.
* Tratamento de estados vazios.
* Feedback visual de sucesso e erro.
* Tratamento de dados inválidos sem encerramento inesperado do aplicativo.



## Checklist de entrega

Antes da entrega final, devem ser confirmados:

* [x] Projeto Android executando no emulador.
* [x] Interface desenvolvida com Jetpack Compose.
* [x] Componentes utilizando Material 3.
* [ ] Cadastro de competidores funcionando.
* [ ] Lista de competidores funcionando.
* [ ] Registro de entregas funcionando.
* [ ] Validações separadas da interface.
* [x] Uso de `data class`.
* [ ] Uso de `sealed class`.
* [ ] Uso de interface para regras.
* [ ] Motor de regras utilizando composição.
* [ ] Pelo menos seis regras concretas.
* [ ] Pelo menos dois objetos de valor.
* [ ] Resultado individual funcionando.
* [ ] Ranking ordenado corretamente.
* [ ] Resumo de penalidades funcionando.
* [ ] Estados vazios implementados.
* [ ] Mensagens obrigatórias conferidas.
* [ ] Tratamento de erros sem crash.
* [ ] Checklist manual atualizado.
* [ ] Evidências registradas.
* [ ] Commits separados por funcionalidade.
* [ ] README final revisado.
* [ ] Apresentação técnica preparada.
