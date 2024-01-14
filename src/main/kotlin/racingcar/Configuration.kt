package racingcar

import racingcar.domain.strategy.MoveStrategy
import racingcar.domain.strategy.RandomMoveStrategy

object Configuration {
    fun moveStrategy(): MoveStrategy {
        return RandomMoveStrategy
    }
}
