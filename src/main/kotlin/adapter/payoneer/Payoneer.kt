package adapter.payoneer

import adapter.utils.Token

class Payoneer : IPayoneerPayments {

    private lateinit var token: Token

    override fun authToken() = Token()

    override fun sendPayment() {
        this.token = authToken()
        println("Enviando pagamentos via Payoneer")
    }

    override fun receivePayment() {
        println("Recebendo pagamentos via Payoneer")
    }
}