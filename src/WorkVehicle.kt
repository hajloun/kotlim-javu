class WorkVehicle(year: Int, brand: String, model: String, spz: String, var maxCapacity: Double) :
    Vehicle(year, brand, model, spz) {
    public override fun displayInfo() {
        super.displayInfo()
        println("Work vehicle with capacity: ${maxCapacity}t")
    }

    override fun drive() {
        println("Work vehicle $brand $model $spz can load ${maxCapacity}t")
    }
}