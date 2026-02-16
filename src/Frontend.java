public class Frontend {
    StudentList list = new StudentList();

    public void run(String[] args){
        System.out.println("Registration system is running.");
        int i = 0;
        while (i< args.length){
            String command = args[i];
            if (command.equals("A")){
                System.out.println("Please enter the first name, last name, date of birth mm/dd/yyyy, major, and number of completed credits.");
                addStudent(args);
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
            i++;
        }
    }

    public void addStudent(String[] args) {
        // Names
        String tempFName = args[1];
        String tempLName = args[2];

        // Date
        String tempDateStr = args[3];
        String[] dateParts = tempDateStr.split("/");
        int month = Integer.parseInt(String.valueOf(dateParts[0]));
        int day = Integer.parseInt(String.valueOf(dateParts[1]));
        int year = Integer.parseInt(String.valueOf(dateParts[2]));
        Date tempDate = new Date(month, day, year);
        if (!tempDate.isValid()) {
            System.out.println("Date of birth is invalid");
            return;
        }

        // Major
        Major major = checkMajor(args[4]);
        if (major == null) {
            System.out.println("Major is invalid. Major must be CS, ECE, MATH, ITI or BAIT");
            return;
        }

        // Credits
        int tempCredits = Integer.parseInt(args[5]);
        if (tempCredits < 0) {
            System.out.println("Credits must be greater than 0");
            return;
        }

        //
        Profile studProfile = new Profile(tempFName, tempLName, tempDate);
        Student stud = new Student(studProfile, major, tempCredits);
        list.add(stud);
    }

    public static Major checkMajor(String input){
        try {
            return Major.valueOf(input.toUpperCase());
        } catch(IllegalArgumentException e) {
            return null;
        }
    }

}

