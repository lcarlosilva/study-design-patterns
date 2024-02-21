package adapter.mercado_pago

import adapter.utils.Token

interface IMercadoPago {
    fun authToken(): Token
    fun sendPayment()
    fun receivePayment()
}