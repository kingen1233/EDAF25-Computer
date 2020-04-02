package instructions;

public interface Instruction {
           
 	List<Command> commandList = new ArrayList<Command>();
 	
 	
	public void execute(); //Tror att denna ska vara void, ska eventuellt ha parametrar in

}
