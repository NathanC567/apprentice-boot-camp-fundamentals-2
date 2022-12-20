package checkout

class Receipt {
    private var offerText = ""

    fun text(total: Int): String {
        return offerText + "Total: " + total
    }

    fun scan(stockCode: Char, quantity: Int, offerQuantity: Int, price: Int, discount: Int) {
        val discountedTotal = price * quantity - discount
        offerText = "$stockCode: $price"
        if (quantity % offerQuantity == 0) offerText += " - $discount ($offerQuantity for $discountedTotal)"
        offerText += "\n"
    }
}