/* Generated by Together */

/**
 * This is an outline of a main program to build the operational infrastructure of PACSUS.
 * Look at the description and code for the main method.
 */
    public class Main {
    
    public static void main(String[] args) {
        System_status systemStatus = new System_status();
        //Vehicle_list vehicleList = new Vehicle_list();
        //Permit_list permitList = new Permit_list();
        // Repeat for as many barriers as required
        //Timer timer = new Timer(systemStatus, permitList);     // Frame, boundary class

       // Barrier barrier1 = new Barrier(systemStatus, vehicleList);  // Frame, boundary class
           Barrier barrier1 c1 = new Barrier( systemStatus,"first woindo") {};
          //Campus_security campusSecurity1 = new Campus_security(systemStatus,"First " );  // Frame, boundary class
           Campus_security c1 = new Campus_security (systemStatus,"second woindo") {};
           Campus_security  campusSecurity= new  Campus_security() ;
          // Repeat for as many campus security screens as required

       // Administration_office adminOffice1 = new Administration_office(systemStatus, vehicleList, permitList);  // Frame, boundary class
          // Repeat for as many admin office screens as required
    } // main
}
