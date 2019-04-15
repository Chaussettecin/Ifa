import java.util.ArrayList;
import java.util.List;

public class Switch {
	
private List<Command> cmdLightlist = new ArrayList<>();
	
	public void receiveCommand(Command cmd) {
		cmdLightlist .add(cmd);
		cmd.execute();
	}

}
