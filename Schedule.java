public class Schedule{

private Section[] sections;
private int numSections;

public Schedule(){
sections = new Section[4];
numSections = 0;




}
private int find(Section section) {
    for(int i = 0; i < numSections; i++){
        
        if((sections[i].equals(section))){
            return i;
        }
    }

    return -1;
}
private void grow() {

    Section[] x = new Section[sections.length + 4];


    for(int k = 0; k < sections.length; k++){

        x[k] = sections[k];
    }

    sections = x;
}


public void add(Section section) {
boolean eq = (sections.length == numSections);

    if(eq){
        
        grow();
    }


    sections[numSections] = section;
    numSections++;
}
public void remove(Section section) {

    int secIndex = find(section);

    if(-1 == secIndex){
    return;
}

else{

    sections[secIndex] = sections[--numSections];

    sections[numSections] = null;
}
}
    
    
public void enroll(Section section, Student student) {
    
    
    int secDex = find(section);

    if(secDex != -1){
        sections[secDex].enroll(student);
    }

}





public void drop(Section section, Student student) {



    int indOfSec = find(section);

    if (indOfSec != -1){

        sections[indOfSec].drop(student);

    }
}



public boolean contains(Section section) {

    boolean res = (find(section) != -1);

    return res;

}



public void printByClassroom() {

int pos;
Classroom ClassR;
Classroom ClassM;
int m;
int bPos;
for(int e = 0; e < numSections - 1; e++){


    m = e;

    for(int r = e + 1; r < numSections; r++){

        ClassR = sections[r].getClassroom();
        ClassM = sections[m].getClassroom();


        pos = (ClassR.getCampus().name().compareToIgnoreCase(ClassM.getCampus().name()));
    
        if(pos < 0){
            m = r;
        }
        else{
            if(pos == 0){

                bPos = ClassR.getBuilding().compareToIgnoreCase(ClassM.getBuilding());
                if(bPos < 0)
                    m = r;
            }
        }
    
    
    }


    Section temp = sections[e];
    sections[e] = sections[m];
    sections[m] = temp;




}

for(int b = 0; b < numSections; b++){
    System.out.println(sections[b]);
}


}



public void printByCourse(){
    int pos;
Course CourseR;
Course CourseM;
int m;
int cPos;
for(int e = 0; e < numSections - 1; e++){


    m = e;

    for(int r = e + 1; r < numSections; r++){

        CourseR = sections[r].getCourse();
        CourseM = sections[m].getCourse();


        pos = (CourseR.toString().compareToIgnoreCase(CourseM.toString()));
    
        if(pos < 0){
            m = r;
        }
        else{
            if(pos == 0){

                cPos = ((sections[r].getTime().getPeriod()) - (sections[m].getTime().getPeriod()));
                if(cPos < 0)
                    m = r;
            }
        }
    
    
    }


    Section temp = sections[e];
    sections[e] = sections[m];
    sections[m] = temp;




}

for(int b = 0; b < numSections; b++){
    System.out.println(sections[b]);
}
   
}
}