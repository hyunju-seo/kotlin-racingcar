package racingcar

import racingcar.domain.CarGame
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val carNames = InputView.getCarNames()
    val tryCount = InputView.getTryCount()

    val carGame = CarGame(Configuration.moveStrategy())
    val result = carGame.play(carNames = carNames, tryCount = tryCount)

    OutputView.printHistory(result.history)
    OutputView.printWinner(result.getWinners())
}
