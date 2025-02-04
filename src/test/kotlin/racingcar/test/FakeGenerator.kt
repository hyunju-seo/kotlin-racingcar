package racingcar.test

import racingcar.domain.Car
import racingcar.domain.CarName
import racingcar.domain.Cars

object FakeGenerator {
    fun generateCars(size: Int, position: Int = 0): Cars {
        val cars = List(size) { generateCarName() }.map { Car(name = it, position = position) }
        return Cars(cars)
    }

    fun generateCarsOfPositions(positions: List<Int>): Cars {
        val cars = positions.map { generateCar(position = it) }
        return Cars(cars)
    }

    fun generateCar(name: String? = null, position: Int): Car {
        val carName = name?.let { CarName(it) } ?: generateCarName()
        return Car(carName, position)
    }

    fun generateCarName(size: Int = 3): CarName {
        return CarName(TestUtil.generateRandomString(size))
    }
}
