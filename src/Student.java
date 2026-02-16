public class Student implements Comparable<Student> {
    private final Profile profile;
    private final Major major;
    private final int credits;

    // Constructor
    public Student(Profile profile, Major major, int credits) {
        this.profile = profile;
        this.major = major;
        this.credits = credits;
    }

    public String classIdentifier(int credits) {
        if (credits < 30) {
            return "Freshman";
        } else if (credits < 60) {
            return "Sophomore";
        } else if (credits < 90) {
            return "Junior";
        } else if (credits > 90) {
            return "Senior";
        }
        return "Senior";
    }

    //override methods
    @Override
    public int compareTo(Student other) {

        /*
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
        */
        return this.profile.compareTo(other.profile);

    }

    @Override
    public String toString() {
        return "[" + profile.getfname() + " " + profile.getlname() + " " + profile.getdob() + " [" + major + "," + major.getSchool()
                + "] credits earned: [" + classIdentifier(credits) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student other)) return false;
        if (this == obj) return true;

        return this.profile.equals(other.profile);
    }
}
