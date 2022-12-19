package bowling

import Bowling.Companion.bowl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class BowlingTest {
    @Test
    fun scoreWithNoHits(){
        val rolls = listOf(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowl(rolls)).isEqualTo(0)
    }
    @Test
    fun scoreWithNoStrikes(){
        val rolls = listOf<Int>(1, 2, 7,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)
        assertThat(bowl(rolls)).isEqualTo(10)
    }
    @Test
    fun scoreWithSpare(){
        val rolls = listOf(5,5, 5,2, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowl(rolls)).isEqualTo(22)
    }
    @Test
    fun scoreWithStrike(){
        val rolls = listOf(10,0, 4,4, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowl(rolls)).isEqualTo(26)
    }

}