package br.Entity

import java.time.format.DateTimeFormatter
import java.util.Date

class PrestacaoContas {

    var idPrestacaoContas: Int  = 0
    var dataPrestacao: Date  = Date() // var date = Date() val formatter = SimpleDateFormat("dd.MM.yyyy. HH:mm:ss") val answer: String = formatter.format(date) Log.d("data 2",answer)
    var qtdPostosVisitados: Int  = 0
    var valorFinalDespesas: Float  = 0.0F
}