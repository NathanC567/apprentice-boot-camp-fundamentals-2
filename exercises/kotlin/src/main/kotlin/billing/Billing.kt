package billing

class Billing {
    companion object {
        fun bill(customer: Customer): Int {
            val adCost = if (customer.customerType == CustomerType.Dealer) 50 else 20
            val productCost = customer.products.size.times(10)
            return customer.numberAds.times(adCost + productCost)
        }
    }
}