package checkout

internal class Checkout {
    private var total = 0
    private var numberOfA = 0
    private var numberOfB = 0
    private var numberOfC = 0
    private var numberOfD = 0
    private val priceA = 50
    private val discountA = 30
    private val offerQuantityA = 5
    private val priceB = 30
    private val discountB = 15
    private val offerQuantityB = 2
    private val priceC = 20
    private val discountC = 10
    private val offerQuantityC = 4
    private val priceD = 15
    private val discountD = 15
    private val offerQuantityD = 5

    private val receipt: Receipt = Receipt()

    fun scan(stockCode: String) {
        when (stockCode) {
            "A" -> {
                ++numberOfA
                discount(numberOfA, offerQuantityA, priceA, discountA)
                receipt.scan('A', numberOfA, offerQuantityA, priceA, discountA)
            }

            "B" -> {
                ++numberOfB
                discount(numberOfB, offerQuantityB, priceB, discountB)
                receipt.scan('B', numberOfB, offerQuantityB, priceB, discountB)
            }

            "C" -> {
                ++numberOfC
                discount(numberOfC, offerQuantityC, priceC, discountC)
                receipt.scan('C', numberOfC, offerQuantityC, priceC, discountC)
            }

            "D" -> {
                ++numberOfD
                discount(numberOfD, offerQuantityD, priceD, discountD)
                receipt.scan('D', numberOfD, offerQuantityD, priceD, discountD)
            }
        }
    }

    private fun discount(quantity: Int, offerQuantity: Int, itemPrice: Int, discount: Int) {
        total += itemPrice
        if (quantity % offerQuantity == 0) {
            total -= discount
        }
    }

    fun total(): Int {
        return total
    }

    fun receipt(): String {
        return receipt.text(total)
    }
}
