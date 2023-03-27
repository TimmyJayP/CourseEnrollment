// Name: T.J.
// Description:For the course's current instructor, we will compare their last name, i.e., if the first argument object has its instructor less than that of the second argument, an integer less than zero is returned; if the first argument object has its instructor's last name larger than that of the second argument, 
//				an int greater than zero is returned. 

import java.util.Comparator;

public class CourseInstructorComparator implements Comparator<Course>
{   //  If the first argument object has its instructor's last name less than that of
    // the second argument, an integer less than zero is returned; if the first argument object has its 
    // instructor's last name larger than that of the second argument, an int greater than zero is returned.
    public int compare(Course first, Course second)
    {
    	return first.getInstructor().getLastName().compareTo(second.getInstructor().getLastName());  
    }
}
