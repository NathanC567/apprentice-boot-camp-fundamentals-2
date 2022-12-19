package billing

class Billing {
    companion object {
        fun bill(customer: Customer): Int {

            return if (customer.customerType == CustomerType.Dealer)
                customer.numberAds.times(50 + customer.products.size.times(10))
            else customer.numberAds.times(20 + customer.products.size.times(10))

        }
    }
}