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
        // Read all data tokens and store them temporarily.
        // If token is not accurate, remove it from that variable and ask again
        // once all are checked and validated, constuct a student profile
        // construct a student
        // add student to student list

        int i = 0;
            while (i< args.length) {
                string tempFName = arg[0];
                string tempLName = arg[1];

                // creating temporary date to insert later
                string tempDateStr = arg[2];
                string[] dateParts = tempdateStr.split("/");
                int month = Integer.parseInt(dateParts[0]);
                int day = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);
                // validating date
                Date tempDate = new Date(month,day,year);
                while(!tempdate.isValid()){

                }
                // removing or finalizing date

                string major = arg[3];
                int tempCredits = arg[4]




            }


    }
}
