import java.time.LocalDate
import java.util.HashMap
class CarPark {
    val vehicleMap: MutableMap<String, Vehicle> = HashMap()
    @Throws(DuplicateSpzException::class)
    fun addVehicle(vehicle: Vehicle?) {
            val spz = vehicle?.spz ?: return
            if (vehicleMap.containsKey(spz)) {
                throw DuplicateSpzException("Vehicle $spz already exist")
            } else vehicleMap[spz] = vehicle

    }

    fun displayAllVehicles() {
        if (!this.vehicleMap.isEmpty()) {
            println("Vehicles in garage:")
            println("--------------------")
            for (v in vehicleMap.values) {
                v.displayInfo()
            }
            println("--------------------")
        } else println("No vehicles in garage")
    }

    fun performMaintenanceOnVehicle(spz: String?) {
        val vehicle = vehicleMap[spz]
        if (vehicle != null) {
            vehicle.performMaintenance()
        } else println("$spz not found")
    }

    fun displayVehiclesNeedingMaintenance(months: Int) {
        println("Vehicles that need maintenance:")
        println("--------------------")
        val currentDate = LocalDate.now()
        var foundAny = false
        for (v in this.vehicleMap.values) {
            val lastMaintenance = v.lastMaintenanceDate
            val nextMaintenance = lastMaintenance.plusMonths(months.toLong())
            if (currentDate.isAfter(nextMaintenance)) {
                v.displayInfo()
                foundAny = true
                println(("Last maintenance: $lastMaintenance next maintenance: $nextMaintenance"))
            }
        }
        if (!foundAny) {
            println("No vehicles that need maintenance")
        }
        println("--------------------")
    }

    fun driveAllVehicles() {
        println("Driving all the vehicles:")
        println("--------------------")
        for (v in this.vehicleMap.values) {
            v.drive()
        }
        println("--------------------")
    }
}