package adapter

import adapter.adapters.MercadoPagoAdapter
import adapter.adapters.PayoneerAdapter
import adapter.mercado_pago.MercadoPago
import adapter.payoneer.Payoneer
import adapter.paypal.IPaypalPayments

fun main() {
    val paypalWithPayoneer: IPaypalPayments
    paypalWithPayoneer = PayoneerAdapter(Payoneer())
    paypalWithPayoneer.paypalPayment()
    paypalWithPayoneer.paypalReceive()

    val paypalWithMercadoPAgo: IPaypalPayments
    paypalWithMercadoPAgo = MercadoPagoAdapter(MercadoPago())
    paypalWithMercadoPAgo.paypalPayment()
    paypalWithMercadoPAgo.paypalReceive()
}