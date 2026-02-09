public class Frontend {
    // Valid commands:A R O C E D P Q
    public void run(String[] args){
        system.out.println("Registration system is running.");
        // 40 line max
        // loop through the amount of args, to catch each arg and perform its function.
        int i = 0;
        while (i< args.length){
            String command = args[i];
            if (command.equals("A")){
                addStudent();
                // fill out later
            }
            else if (command.equals("R")){
                // fill out later
            }
            else if (command.equals("O")){
                // fill out later
            }
            else if (command.equals("C")){
                // fill out later
            }
            else if (command.equals("E")){
                // fill out later
            }
            else if (command.equals("D")){
                // fill out later
            }
            else if (command.equals("P")){
                // fill out later
            }
            else if (command.equals("Q")){
                // fill out later
            }
        }
    }

    public void addStudent(){
        system.out.println("Please enter the first name, last name, date of birth mm/dd/yyyy, major, and number of completed credits.");

    }
}
