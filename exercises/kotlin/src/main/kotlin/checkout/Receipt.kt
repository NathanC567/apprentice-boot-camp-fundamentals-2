package checkout

class Receipt {
    private var offerText = ""
    private var numberOfA = 0
    private var total = 0
    private var numberOfB = 0
    fun text(): String {
        return offerText + "Total: " + total
    }

    fun scannedA() {
        offerText += "A: 50"
        if (++numberOfA % 5 == 0) offerA() else total += 50
        offerText += "\n"
    }

    private fun offerA() {
        offerText += " - 30 (5 for 220)"
        total += 30
    }

    fun scannedB() {
        val amountForOfferB = 2
        offerText += "B: 30"
        if (++numberOfB % amountForOfferB == 0) offerB() else total += 30
        offerText += "\n"
    }

    private fun offerB() {
        offerText += " - 15 (2 for 45)"
        total += 15
    }

    fun scannedC() {
        offerText += "C: 20\n"
        total += 20
    }

    fun scannedD() {
        offerText += "D: 15\n"
        total += 15
    }
}
