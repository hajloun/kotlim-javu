class PrivateVehicle(year: Int, brand: String, model: String, spz: String, var seatCount: Int) :
    Vehicle(year, brand, model, spz) {
    public override fun displayInfo() {
        super.displayInfo()
        println("Private vehicle with: $seatCount seats")
    }

    override fun drive() {
        println("Private vehicle $brand $model $spz have $seatCount seats")
    }
}