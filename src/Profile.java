public class Profile implements Comparable<Profile>{
    private final String fname;
    private final String lname;
    private final Date dob;

    public Profile(String fname, String lname, Date dob) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    //Override functions
    @Override
    public int compareTo(Profile other){
        // first compare by last name
        int compareLname = this.lname.compareTo(other.lname); //returns -1,0,1
        if (compareLname != 0){ //if they are not the same...
            return compareLname;
        }
        // after compare by first names
        int compareFname = this.fname.compareTo(other.fname);
        if (compareFname != 0){
            return compareFname;
        }
        // lastly compare by dob, so its people of highest dob & fname in last names
        return this.dob.compareTo(other.dob);
    }

    @Override
    public String toString(){
        return fname + " " + lname + " " + dob + ".";
    }

    @Override
    public boolean equals(){
        if (obj instanceof Profile){
            Profile other = (Profile) obj;
            return fname.equals(other.fname) && lname.equals(other,lname) && dob.equals(other.dob);
        }
    }
}
