package bowling

import Bowling.Companion.bowl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class BowlingTest {
    @Test
    fun renameMe(){
        val rolls = intArrayOf(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowl(rolls)).isEqualTo(0)
    }
    @Test
    fun scoreWithNoStrikes(){
        val rolls = intArrayOf(1, 2, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,7)
        assertThat(bowl(rolls)).isEqualTo(10)
    }
    
}