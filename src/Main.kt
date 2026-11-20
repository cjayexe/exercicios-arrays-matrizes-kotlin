fun main() {

    // QUESTÃO 1 - Inversão de Vetor
    println("===== QUESTÃO 1 =====")

    val numeros = intArrayOf(1, 2, 3, 4, 5, 6)

    var inicio = 0
    var fim = numeros.size - 1

    while (inicio < fim) {
        val temporario = numeros[inicio]
        numeros[inicio] = numeros[fim]
        numeros[fim] = temporario

        inicio++
        fim--
    }

    println("Vetor invertido: ${numeros.contentToString()}")


    // QUESTÃO 2 - Busca e Interrupção
    println("\n===== QUESTÃO 2 =====")

    val codigos = arrayOf("A101", "B202", "C303", "D404", "E505")
    val codigoProcurado = "C303"

    for (i in codigos.indices) {
        if (codigos[i] == codigoProcurado) {
            println("Código encontrado na posição $i")
            break
        }
    }


    // QUESTÃO 3 - Média de Temperaturas
    println("\n===== QUESTÃO 3 =====")

    val temperaturas = doubleArrayOf(28.0, 30.0, 32.0, 29.0, 35.0, 31.0, 33.0)

    var soma = 0.0

    for (temperatura in temperaturas) {
        soma += temperatura
    }

    val media = soma / temperaturas.size

    println("Média da semana: $media")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Dia ${i + 1}: ${temperaturas[i]} graus")
        }
    }


    // QUESTÃO 4 - Filtragem de Pares com Step
    println("\n===== QUESTÃO 4 =====")

    val valores = IntArray(20) { it + 1 }
    var somaPares = 0

    for (i in valores.indices step 2) {
        somaPares += valores[i]
    }

    println("Soma dos valores em índices pares: $somaPares")


    // QUESTÃO 5 - Listagem com Índices
    println("\n===== QUESTÃO 5 =====")

    val tarefas = arrayOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Revisar o conteúdo",
        "Enviar atividade",
        "Estudar matrizes"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${indice + 1}: $tarefa")
    }


    // QUESTÃO 6 - Soma por Linhas
    println("\n===== QUESTÃO 6 =====")

    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )

    for (linha in matriz.indices) {
        var somaLinha = 0

        for (coluna in matriz[linha].indices) {
            somaLinha += matriz[linha][coluna]
        }

        println("Soma da linha ${linha + 1}: $somaLinha")
    }


    // QUESTÃO 7 - Matriz Transposta
    println("\n===== QUESTÃO 7 =====")

    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val transposta = Array(3) { IntArray(2) }

    for (linha in original.indices) {
        for (coluna in original[linha].indices) {
            transposta[coluna][linha] = original[linha][coluna]
        }
    }

    println("Matriz original:")
    for (linha in original) {
        println(linha.contentToString())
    }

    println("Matriz transposta:")
    for (linha in transposta) {
        println(linha.contentToString())
    }


    // QUESTÃO 8 - Análise de Diagonais
    println("\n===== QUESTÃO 8 =====")

    val quadrada = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    var somaDiagonal = 0

    for (linha in quadrada.indices) {
        for (coluna in quadrada[linha].indices) {
            print("${quadrada[linha][coluna]}\t")

            if (linha == coluna) {
                somaDiagonal += quadrada[linha][coluna]
            }
        }
        println()
    }

    println("Soma da diagonal principal: $somaDiagonal")


    // QUESTÃO 9 - Identificação de Zeros com Continue
    println("\n===== QUESTÃO 9 =====")

    val matrizZeros = arrayOf(
        intArrayOf(1, 0, 3),
        intArrayOf(4, 5, 0),
        intArrayOf(7, 8, 9)
    )

    var somaPositivos = 0

    for (linha in matrizZeros) {
        for (valor in linha) {
            if (valor == 0) {
                continue
            }

            if (valor > 0) {
                somaPositivos += valor
            }
        }
    }

    println("Soma dos valores positivos: $somaPositivos")


    // QUESTÃO 10 - Boletim de Alunos
    println("\n===== QUESTÃO 10 =====")

    val notas = arrayOf(
        doubleArrayOf(8.0, 7.0),
        doubleArrayOf(5.0, 6.0),
        doubleArrayOf(9.0, 10.0)
    )

    var somaMedias = 0.0

    for (aluno in notas.indices) {
        val mediaAluno = (notas[aluno][0] + notas[aluno][1]) / 2

        somaMedias += mediaAluno

        if (mediaAluno >= 7.0) {
            println("Aluno ${aluno + 1}: Aprovado - Média: $mediaAluno")
        } else {
            println("Aluno ${aluno + 1}: Reprovado - Média: $mediaAluno")
        }
    }

    val mediaTurma = somaMedias / notas.size

    println("Média geral da turma: $mediaTurma")
}