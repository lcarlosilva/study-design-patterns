package adapter.paypal

import adapter.utils.Token

interface IPaypalPayments {
    fun authToken(): Token
    fun paypalPayment()
    fun paypalReceive()
}