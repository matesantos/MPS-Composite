/**
 *
 * @author Diego - Mateus
 */
public class Machine implements MachineComponent{
    int i = 0;
    
    private String status;
    private String owner;
    
    
    public Machine(String status, String owners ){
        this.owner = owners;
        this.status =  status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owners) {
        this.owner = owners;
    }
    
    
    @Override
    public int getMachineCount() {
       return i++;
    }

    @Override
    public boolean isCompletelyUp() {
        if(getStatus().equalsIgnoreCase("UP")){
            return true;
        }
        
        return false;
    }

    @Override
    public void startAll() {
        setStatus("UP");
    }

    public void stopAll() {
        setStatus("DOWN");
    }

	@Override
	public void getOwners() {
		
		System.out.println(owner);
		
	}        
    
   
}
