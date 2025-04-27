import java.time.LocalDate

abstract class Vehicle(var year: Int, var brand: String, var model: String, var spz: String) : Maintainable {
    var lastMaintenanceDate = LocalDate.now().minusYears(1)
        private set

    abstract fun drive()

    open fun displayInfo() {
        println("$brand $model ($year) SPZ: $spz")
    }

    override fun performMaintenance() {
        lastMaintenanceDate = LocalDate.now()
        println("$spz maintenance done. Last maintenance date: $lastMaintenanceDate")
    }
}