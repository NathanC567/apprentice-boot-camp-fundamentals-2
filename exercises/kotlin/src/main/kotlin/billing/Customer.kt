package billing

class Customer(
    var customerType: CustomerType,
    var numberAds: Int,
    var products: List<String>
)

enum class CustomerType {
    Dealer,
    Private
}


