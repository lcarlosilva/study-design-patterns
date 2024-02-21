package adapter.mercado_pago

import adapter.utils.Token

class MercadoPago: IMercadoPago {
    private lateinit var token: Token

    override fun authToken() = Token()

    override fun sendPayment() {
        this.token = authToken()
        println("Enviando pagamento via mercado pago")
    }

    override fun receivePayment() {
        println("Recebendo pagamento via mercado pago")
    }
}