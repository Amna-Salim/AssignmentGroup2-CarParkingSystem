import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

   public abstract class Barrier extends JFrame implements Observer {
   //  private Vehicle_list lnkVehicle_list;
    private System_status lnkSystem_status;
    private boolean active = false;
    private boolean raised = true;
    private Campus_security campusSecurity;
    private JTextField display;
    private final System_status systemStatus;

    public Barrier(Campus_security campusSecurity,System_status systemStatus ) {
        
      this.campusSecurity = campusSecurity;  
      this.systemStatus = lnkSystem_status;
      
      // Set up view GUI
        setBackground(Color.cyan);
        add(new JLabel("Barrier"));
        display = new JTextField("No data", 15);
        add(display);
        
           systemStatus.addObserver(this);
        
    }
     // Notified by the model when it is altered:
    public void update(Observable o, Object arg) {
        
        // Fetch (potentially) updated information and display it
        int a = systemStatus.getDataA();
        display.setText("System_status data A: " + a);
        
    } // update
    
    // Called by the controller to clear the view:
    public void clear() {
        
        display.setText("");
      
  } // clear
}
 

 

