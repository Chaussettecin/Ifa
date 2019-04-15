
public class CloseSwitch implements Command {

	private Light lightRoom;
	
	
	public CloseSwitch(Light lightRoom) {
		this.lightRoom = lightRoom;
	}
	
	
	@Override
	public void execute() {
		lightRoom.close();
	}


}
