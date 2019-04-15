import java.util.ArrayList;

public class Calculator {

	private Number op = new Number();
    private ArrayList<Command> commands = new ArrayList<Command>();

    private int current = 0;

    public void redo(int levels) {
        System.out.println("\n---- Redo " + levels + " levels ");
        
     //-- Redo operations
        for (int i = 0; i < levels; i++) {
            if (current < commands.size()) {
                Command command = commands.get(current++);
                command.execute();
            }
        }
    }

    public void undo(int levels) {
        System.out.println("\n---- Undo " + levels + " levels ");
      
      //-- Undo -
        for (int i = 0; i < levels; i++) {
            if (current >= 0) {
                Command command = commands.get(--current);
                command.unExecute();
            }
        }
    }

    public void compute(char operator, int operand) {
    //--- Creation operation command qui va s'executer
        
        Command command = new Cal( op, operator, operand);
        command.execute();

     //---- Add command => liste Undo 
        commands.add(command);
        current++;
    }
}
