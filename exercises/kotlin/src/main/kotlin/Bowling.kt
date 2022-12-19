class Bowling {
    companion object {

        fun bowl(bowls: List<Int>): Int {
            var score = 0
            var frameIndex = 0
            val frames = 0..9
            fun isStrike(firstBowl: Int) = (firstBowl == 10)
            fun isSpare(firstBowl: Int, secondBowl: Int) = (firstBowl + secondBowl == 10)

            for (frame in frames) {
                if (isStrike(bowls[frameIndex])) {
                    score += 10 + bowls[frameIndex + 1] + bowls[frameIndex + 2]
                    frameIndex++
                } else if (isSpare(bowls[frameIndex], bowls[frameIndex + 1])) {
                    score += 10 + bowls[frameIndex + 2]
                    frameIndex += 2
                } else {
                    score += bowls[frameIndex] + bowls[frameIndex + 1]
                    frameIndex += 2
                }
            }
            return score
        }
    }
}