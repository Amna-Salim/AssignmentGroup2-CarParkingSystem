import java.util.Date;
import java.util.Observable;


public class System_status extends Observable {
    
    private boolean systemActive = false;
    private String[] log;
    private Date today;
    private int dataBaseA;

    int getDataA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public System_status() {}
        
    public void System_statusA() {        // Mutator method for B component
        
        dataBaseA++;
        setChanged();
        notifyObservers();    
    }
       
       
        
    } // getDataA
    
        
        
    
    
    
    
    

