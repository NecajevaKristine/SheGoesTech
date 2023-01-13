package homeworks.HW15;

        /*Maximum Distance:
        Create a class called Vehicle that have three  fields fuel and fuelUsage
        (liters/100km) both float data type and passengers type int. All of these fields
        should be private. In order to assign value to these fields create a custom
        constructor that allows you to pass all these values as input parameters.
         fuel is the number of liters of fuel in the fuel tank.
         fuelUsage is basic fuel consumption per 100 km (with the driver inside
        only).
         Every additional passengers is increasing basic fuel consumption by 5%. For
        example let’s say that fuelUsage = 6.7 and there are 2 passengers so
        they increase fuel consumption each by 5% (10% together from 6.7). 10%
        from 6.7 is 0.67 so two additional passengers increased fuel consumption
        from 6.7 to 6.7 + 0.67 = 7.37
        Create a method in Vehicle class that can calculate and returns maximum distance
        called maxDistance that vehicle can travel, based on fuel and fuelUsage field
        values. But keep in mind that passengers field value will affect fuelUsage. How
        to return result is up to you, but round result up to 2 decimal places. Use Scanner
        and input from user, create objects passing values you read from the user and see if
        you get correct calculations calling objects method maxDistance.
        Examples:
        maxDistance (70.0, 7.0, 0) ➞ 1000.0
        maxDistance (55.5, 5.5, 5) ➞ 807.27

        Additional task (optional):
        Create a subclass (child’s class) called Car that extends (inherits) all Vehicle class
        fields and methods. Create an additional field airConditioner (boolean) and
        create a custom constructor for Car class so it takes four values as input (fuel,
        fuelUsage, passengers, airConditioner). Then override method
        maxDistance and take in calculations airConditioner field value. If it’s true then
        add additional 10% to fuel consumption after you have calculated passengers
        created impact. So to take the previous example with two passengers fuel
        consumption increased from 6.7 to 7.37 and if airConditioner field value is true
        calculate additional 10% from 7.37 so it would be 7.37 + 7.37 * 0.1 = 8.107
        Examples:
        maxDistance (70.0, 7.0, 0,true) ➞ 909.09
        maxDistance (36.1, 8.6, 3, true) ➞ 331.83
        maxDistance (70.0, 7.0, 0,false) ➞ 1000.0*/

public class Vehicles {
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

public Vehicles (float fuel,float fuelUsage,int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
}

public float maxDistance (float fuel, float fuelUsage, int passengers){
    return fuel/(fuelUsage *(1+passengers*0.05f))*100;
}
public float maxDistance(){
    float fuelUsageWithPassengers = (fuelUsage *(1+(0.05f * passengers)));
    return Math.round((fuel/fuelUsageWithPassengers)*100);
}
}
