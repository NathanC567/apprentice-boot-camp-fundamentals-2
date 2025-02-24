package checkout

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheckoutTest {
    @Test
    fun oneA() {
        val checkout = Checkout()
        checkout.scan("A")
        assertEquals(checkout.total(), 50)
    }

    @Test
    fun twoA() {
        val checkout = Checkout()
        repeat(2) {
            checkout.scan("A")
        }
        assertEquals(checkout.total(), 100)
    }

    @Test
    fun threeA() {
        val checkout = Checkout()
        repeat(3) {
            checkout.scan("A")
        }
        assertEquals(checkout.total(), 150)
    }


    @Test
    fun sixA() {
        val checkout = Checkout()
        repeat(6) {
            checkout.scan("A")
        }
        assertEquals(checkout.total(), 270)
    }

    @Test
    fun oneB() {
        val checkout = Checkout()
        checkout.scan("B")
        assertEquals(checkout.total(), 30)
    }

    @Test
    fun twoB() {
        val checkout = Checkout()
        repeat(2) {
            checkout.scan("B")
        }
        assertEquals(checkout.total(), 45)
    }

    @Test
    fun fourB() {
        val checkout = Checkout()
        repeat(4) {
            checkout.scan("B")
        }
        assertEquals(checkout.total(), 90)
    }
    @Test
    fun twoC() {
        val checkout = Checkout()
        repeat(2) {
            checkout.scan("C")
        }
        assertEquals(checkout.total(), 40)
    }
    @Test
    fun twoD() {
        val checkout = Checkout()
        repeat(2) {
            checkout.scan("D")
        }
        assertEquals(checkout.total(), 30)
    }
    @Test
    fun sixC() {
        val checkout = Checkout()
        repeat(6) {
            checkout.scan("C")
        }
        assertEquals(checkout.total(), 110)
    }
    @Test
    fun sixD() {
        val checkout = Checkout()
        repeat(6) {
            checkout.scan("D")
        }
        assertEquals(checkout.total(), 75)
    }

    @Test
    fun simple() {
        val checkout = Checkout()
        checkout.scan("A")
        assertEquals(checkout.total(), 50)
        checkout.scan("B")
        assertEquals(checkout.total(), 80)
        checkout.scan("C")
        assertEquals(checkout.total(), 100)
        checkout.scan("D")
        assertEquals(checkout.total(), 115)
    }

    @Test
    fun incremental() {
        val checkout = Checkout()
        checkout.scan("A")
        assertEquals(checkout.total(), 50)
        checkout.scan("B")
        assertEquals(checkout.total(), 80)
        checkout.scan("A")
        assertEquals(checkout.total(), 130)
        checkout.scan("A")
        assertEquals(checkout.total(), 180)
        checkout.scan("B")
        assertEquals(checkout.total(), 195)
        checkout.scan("C")
        assertEquals(checkout.total(), 215)
        checkout.scan("B")
        assertEquals(checkout.total(), 245)
        checkout.scan("C")
        assertEquals(checkout.total(), 265)
        checkout.scan("D")
        assertEquals(checkout.total(), 280)
        checkout.scan("D")
        assertEquals(checkout.total(), 295)
        checkout.scan("D")
        assertEquals(checkout.total(), 310)
        checkout.scan("C")
        assertEquals(checkout.total(), 330)
    }
}