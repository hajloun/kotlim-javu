import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
internal class CarParkTest {
    private lateinit var carPark: CarPark

    @BeforeEach
    fun setUp() {
        carPark = CarPark()
    }

    @Test
    fun `addVehicle should add vehicle to the map when spz is unique`(){
        val testVehicle = PrivateVehicle(2020, "TestBrand", "TestModel", "TEST-001", 5)
        val initialSize = carPark.vehicleMap.size

        assertDoesNotThrow{
            carPark.addVehicle(testVehicle)
        }

        val newSize = carPark.vehicleMap.size

        assertEquals(initialSize+1, newSize, "Map size should increase by 1")

        val addedVehicle = carPark.vehicleMap["TEST-001"]

        assertNotNull(addedVehicle, "Vehicle should be found in the map")

        assertEquals(testVehicle.brand, addedVehicle?.brand, "Brand should match")

        assertEquals(testVehicle.model, addedVehicle?.model, "Model should match")



    }
}