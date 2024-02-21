package adapter.payoneer

import adapter.utils.Token

interface IPayoneerPayments {
    fun authToken(): Token
    fun sendPayment()
    fun receivePayment()
}