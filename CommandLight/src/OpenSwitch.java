
public class OpenSwitch implements Command {

private Light lightRoom;
	
	
	public OpenSwitch(Light lightRoom) {
		this.lightRoom = lightRoom;
	}
	
	
	@Override
	public void execute() {
		lightRoom.open();;
	}
	
	

}
