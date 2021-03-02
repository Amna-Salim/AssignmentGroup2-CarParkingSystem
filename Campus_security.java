import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

    public abstract class Campus_security extends JFrame implements Observer {
   // private  Vehicle_list lnkVehicle_list;
    private  System_status lnkSystem_status; 
    private JButton activate;           // For direct message to views
    private JButton deactivate;        // To prompt the model to "modify" itself (A component)
    private JButton Warnings; 
    private Barrier barrier1; 
    private System_status systemStatus;
   
    
    public Campus_security (System_status systemStatus,String WelcomeWindow2) {
        this.systemStatus = systemStatus;
        // Configure the window
        //setTitle("Controller1");
        setTitle("Welcome Window2");
        setLocation(40,40);
        setSize(350,150);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());     // The default is that JFrame uses BorderLayout
       
        activate = new JButton("activate");
        window.add(activate);
        activate.addActionListener((ActionListener) this);
        
        deactivate = new JButton("deactivate");
        window.add(deactivate);
        deactivate.addActionListener((ActionListener) this);
        
        Warnings = new JButton("Warnings");
        window.add(Warnings);
        Warnings.addActionListener((ActionListener) this);
        
        // Create views
        barrier1 = new Barrier(this,systemStatus) {};
        window.add(barrier1);
    } // constructor
    
// Button click handling:
   public void actionPerformed(ActionListener e) {
      
     if    (e.getSource() == activate) {
           barrier1.clear(); 
        }
     else if (e.getSource() == deactivate) 
            systemStatus. System_statusA();                                
     else if (e.getSource() == Warnings)
             System.exit(0);
          
   }// actionPerformed 
  
} // class Controller1



    
      
