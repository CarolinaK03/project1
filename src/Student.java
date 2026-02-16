public class Student implements Comparable<Student> {
    private Profile profile;
    private Major major;
    private int credits;

    // Constuctor
    public Student(Profile profile, Major major, int credits) {
        this.profile = profile;
        this.major = major;
        this.credits = credits;
    }

    public String classIdentifier(int credits) {
        if (credits < 30) {
            return "Freshman";
        } else if (credits < 60) {
            return "Freshman";
        } else if (credits < 90) {
            return "Junior";
        } else if (credits > 90) {
            return "Senior";
        }
        return "";
    }

    //override methods
    @Override
    public int compareTo(Student other) {
        int compareProfile = this.profile.compareTo(other.profile); //returns -1,0,1
        if (compareProfile != 0) {
            return compareProfile;
        }

        int compareMajor = this.major.compareTo(other.major);
        if (compareMajor != 0) {
            return compareMajor;
        }

        int compareCredits = Integer.compare(this.credits, other.credits);
        if (compareCredits != 0) {
            return compareCredits;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "[" + profile.getfname() + " " + profile.getlname() + " " + profile.getdob() + " " + "[" + major + "," + major.getSchool()
                + "] credits earned: " + "[" + student.classIdentifier + "]";
    }

    @Override
    public boolean equals(Object Obj) {
        if (!(obj instanceof Student)) return false;

        if (this == obj) return true;

        return this.student.equals(other.student);
    }
}

}
