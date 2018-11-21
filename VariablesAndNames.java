public class VariablesAndNames
{
	public static void main(String[] args)
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capicaty, average_passengers_per_car;
		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capicaty = cars_driven * space_in_a_car;
		average_passengers_per_car = passengers / cars_driven;

		System.out.println("There are " + cars + " cars avaiable.");
		System.out.println("There are only " + drivers + " drivers avaiable.");
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		System.out.println("We can transport " + carpool_capicaty + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
	}
}
