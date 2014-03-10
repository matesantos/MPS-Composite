/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public interface MachineComponent {
    
    public int getMachineCount ();
    public boolean isCompletelyUp();
    public void startAll();
    public void stopAll();
    public void getOwners();
    
    
}
