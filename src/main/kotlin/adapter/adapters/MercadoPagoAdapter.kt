package adapter.adapters

import adapter.mercado_pago.MercadoPago
import adapter.paypal.IPaypalPayments
import adapter.utils.Token

class MercadoPagoAdapter(
    private val mercadoPago: MercadoPago
): IPaypalPayments {
    private lateinit var token: Token

    override fun authToken() = Token()

    override fun paypalPayment() {
        this.token = authToken()
        mercadoPago.sendPayment()
    }

    override fun paypalReceive() {
        mercadoPago.receivePayment()
    }
}