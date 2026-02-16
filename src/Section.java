public class Section{

private Course course; 
private Instructor instructor;
private Classroom classroom;
private Time time; 
private Student[] roster; 
private int numStudents; 




public Section(Course c, Instructor i, Classroom cr, Time t){

course = c;

instructor = i;

classroom = cr;

time = t;

numStudents = 0;

roster = new Student[4];





}

public boolean isEmpty(){
    boolean emp = (numStudents == 0);
    return emp;
}

public Instructor getInstructor(){
    return instructor;
}

public Course getCourse(){
    return course;
}

public Classroom getClassroom(){
    return classroom;
}

public Time getTime(){
    return time;
}


public void enroll(Student student) {


    if(contains(student) || (isFull())){
        return;

    }


    else{

        roster[numStudents++] = student;
    }
}



public void drop(Student student) {
    for(int z = 0; z < numStudents; z++){

        if(student.equals(roster[z])){


            roster[z] = roster[--numStudents];

            roster[numStudents] = null;
            
            

            return;

        }
    }

}  


public boolean contains(Student student) {
    for(int j = 0; j < numStudents; j++){
        
        if(student.equals(roster[j])){

            return true;
        }
    }


    return false;
} 


public boolean isFull() {
    boolean fool = (numStudents == 4);

    return fool;
} 



public void print() {

    System.out.println(this);
} 





@Override
public boolean equals(Object awbject){

    if(!((awbject instanceof Section))){

        return false;
    }

    else{
        Section u = ((Section)awbject);

        boolean res = ((u.time == time) && (u.course == course));
        
        return res;
    }
}

@Override
public String toString(){

    return "[" + course + " " + time.getStartTime() + "] " + "[" + instructor + "] " + "[" + classroom + "]";
}

}
