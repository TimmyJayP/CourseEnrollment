// Name: T.J.
// Description: This adds the Comparator interface that orders the courses in alphabetical order.

import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course> {
	
	//If the first argument Course has its name larger than that of the second argument, an integer greater than zero is returned.
	//If the two Course names are the same, then 0 should be returned. 
	public int compare(Course first, Course second) {
		return first.getCourseName().compareTo(second.getCourseName());
	}

}
