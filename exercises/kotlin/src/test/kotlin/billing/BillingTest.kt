package billing

import billing.Billing.Companion.bill
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillingTest {
    @Test
    fun correctForArthur() {
        val arthur = Customer(CustomerType.Dealer, 20, listOf("Ad Promo"))
        assertThat(bill(arthur)).isEqualTo(1200)
    }
    @Test
    fun correctForDerek() {
        val derek = Customer(CustomerType.Private, 3, listOf())
        assertThat(bill(derek)).isEqualTo(60)
    }
    @Test
    fun correctForSuper() {
        val superCar = Customer(CustomerType.Dealer, 1000, listOf("1", "2"))
        assertThat(bill(superCar)).isEqualTo(70000)
    }
    @Test
    fun correctForSarah() {
        val sarah = Customer(CustomerType.Private, 1, listOf("1"))
        assertThat(bill(sarah)).isEqualTo(30)
    }

}