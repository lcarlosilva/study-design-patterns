package adapter.adapters

import adapter.payoneer.Payoneer
import adapter.paypal.IPaypalPayments
import adapter.utils.Token

class PayoneerAdapter(
    private val payoneer: Payoneer
) : IPaypalPayments {
    private lateinit var token: Token

    override fun authToken() = Token()

    override fun paypalPayment() {
        this.token = authToken()
        payoneer.sendPayment()
    }

    override fun paypalReceive() {
        payoneer.receivePayment()
    }
}