package seg3x02.pms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PmsApplication

fun main(args: Array<String>) {
    runApplication<PmsApplication>(*args)
}

fun test() {
    println("Hello World!")
}

