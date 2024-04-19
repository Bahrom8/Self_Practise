package day26_practices.Restaurant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

   /* public boolean fullTime() {

        if (fullTime == true) {
            System.out.println("Full Time");
        } else {
            System.out.println("Part Time");
        }
        return fullTime;
    }

    */

    public void takeOrder(){
        System.out.println(name + " is taking order");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning table");
    }



    public String toString() {
        return "\n\tServer" +
                "\nname: " + name + '\'' +
                "\nemployee ID: " + employeeID +
                "\nhourly Rate: $" + hourlyRate +
                "\nfull Time: " + fullTime +
                "\nhire date: " + hire_date.format(DateTimeFormatter.ofPattern("MM/dd/y"));
    }


}
/*
Restaurant Task:
		4.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields.

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time."

		4.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields.

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time."

		4.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the
	                Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the ArrayList of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the ArrayList of the server

	                toString(): Return (String) all the information on a Restaurant object. No need to print the
	                whole list of Servers or Chefs. Print the number of Servers and Chefs alongside the other information.


		4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList
	        	of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of
	            Chefs in the Restaurant object

	            - Print your whole restaurant's information

 */
