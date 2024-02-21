package adapter.paypal

import adapter.utils.Token

class Paypal : IPaypalPayments {

    private lateinit var token: Token

    override fun authToken() = Token()

    override fun paypalPayment() {
        this.token = authToken()
        println("Enviando pagamentos via PayPal")
    }

    override fun paypalReceive() {
        println("Recebendo pagamentos via PayPal")
    }
}