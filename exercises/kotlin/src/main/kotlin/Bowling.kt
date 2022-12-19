class Bowling {
    companion object {

        fun bowl(bowls: List<Int>): Int {
            var score = 0
            val frames = bowls.windowed(2, 2)

            fun isStrike(firstBowl: Int) = (firstBowl == 10)
            fun isSpare(sumBowls: Int) = (sumBowls == 10)
            for (frame in frames) {
                val nextFrame = frames[frames.indexOf(frame) + 1]
                if (isStrike(frame[0])) score += 10 + nextFrame.sum()
                else if (isSpare(frame.sum())) score += 10 + nextFrame[0]
                else score += frame.sum()
            }
            return score
        }
    }
}