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

    public void addStudent() {
        system.out.println("Please enter the first name, last name, date of birth mm/dd/yyyy, major, and number of completed credits.");
        // Read all data tokens and store them temporarily.
        // If token is not accurate, return
        // Once all are checked and validated, construct a student profile
        // Construct a student
        // Add student to student list

        // Names
        string tempFName = args[0];
        string tempLName = args[1];

        // Date
        string tempDateStr = args[2];
        string[] dateParts = tempDateStr.split("/");
        int month = Integer.parseInt(String.valueOf(dateParts[0]));
        int day = Integer.parseInt(String.valueOf(dateParts[1]));
        int year = Integer.parseInt(String.valueOf(dateParts[2]));

        Date tempDate = new Date(month, day, year);
        if (!tempdate.isValid()) {
            system.out.println("Date of birth is invalid");
            return;
        }

        // Major
        Major major = checkMajor(args[3]);
        if (major == null) {
            system.out.println("Major is invalid. Major must be CS, ECE, MATH, ITI or BAIT");
            return;
        }

        //Credits
        int tempCredits = Integer.parseInt(args[4]);
        if (tempCredits < 0) {
            system.out.println("Credits must be greater than 0");
            return;
        }

        //
         // ADD FUNCTIONALITY TO ADD STUDENT
        //
    }


    public static Major checkMajor(String input){
        try {
            return Major.valueOf(input.toUpperCase());
        } catch(IllegalArgumentException e) {
            return null;
        }
    }

}

