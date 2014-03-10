/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego-Mateus
 */
public class Main {
	
	List<MachineComponent> machines;
	
	public Main(List<MachineComponent> machines){
		this.machines = machines;
	}
	
	public int getCount(){
		int num = 0;
		for (MachineComponent i: machines) {
			num = num + i.getMachineCount();
		}
		return num;
	}
	
	public void isCompletelyUp(){
		
		for (MachineComponent i: machines) {
			if(!i.isCompletelyUp())
				System.out.println("Existem componetes que não estão UP.");
			else
				System.out.println("Todos estão UP.");
		}
		
	}
	
	public void startAll(){
		for (MachineComponent i: machines) {
			i.startAll();
		}
	}
	
	public void stopAll(){
		for (MachineComponent i: machines) {
			i.stopAll();
		}
	}

	public void showOwners(){
		for (MachineComponent i: machines) {
			i.getOwners();
		}
	}
   
    public static void main(String[] args) {
		

		Machine m1 = new Machine("UP","mateus");
		Machine m2 = new Machine("UP","raoni");
		Machine m3 = new Machine("UP","diego");
		Machine m4 = new Machine("DOWN","gizzane");
                
        List<MachineComponent> maquinas = new ArrayList<MachineComponent>(); 
		maquinas.add(m1);
		maquinas.add(m2);
        maquinas.add(m3);
		maquinas.add(m4);
        

		Main m = new Main(maquinas);		
		System.out.println("Número Total: "+m.getCount());
		m.isCompletelyUp();
		m.startAll();
		m.isCompletelyUp();
		m.stopAll();
		m.showOwners();
	}
}
