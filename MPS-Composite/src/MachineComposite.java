/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author Diego - Mateus
 */
public class MachineComposite implements MachineComponent{
    int i = 0;
    
    private List<Machine> machines;
    
    public MachineComposite (List<Machine> machines){
        this.machines = machines;
    }
      
    @Override
    public int getMachineCount() {
       return machines.size();
    }

    @Override
    public boolean isCompletelyUp() {
        
        for(Machine mac : machines){
            if(mac.getStatus().equalsIgnoreCase("UP"))
                i++;
        }
        
        return machines.size() == i;
    }

    @Override
    public void startAll() {
        for(Machine mac : machines){
            mac.setStatus("UP");
        }
    }

    @Override
    public void stopAll() {
        for(Machine mac : machines){
            mac.setStatus("DOWN");
        }
    }    

    @Override
    public void getOwners() {
        for(Machine mac : machines)
           System.out.println(mac.getOwner());
    }        
}
