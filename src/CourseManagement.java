// Name: T.J.
// Description: The CourseManagement class has a list of Course objects that can be organized by the Course management system


//import all necessary classes
import java.io.Serializable;
import java.util.ArrayList;

public class CourseManagement implements Serializable
{
    ArrayList<Course> courseList;

    /**
     * Create and instantiate the courseList
     */
    public CourseManagement()
    {
        //this initialized the ArrayList courseList
    	courseList = new ArrayList<Course>();

    }

    /**
     * Search for a Course object in courseList by both its name and university.
     * Return the index of the object if it is found. Otherwise, return -1.
     * 
     * @param  courseName
     * @param  universityName
     * @return                the index of the Course object if found; -1
     *                        otherwise
     */
    public int courseExists(String courseName, String universityName)
    {
        //write code here
    	for (int i = 0; i<courseList.size(); i++) {
    		Course courseEx = courseList.get(i);
    			if(courseEx.getCourseName().equalsIgnoreCase(courseName) 
    				&& courseEx.getUniversity().equalsIgnoreCase(universityName))
    				return i; {
    					
    				}
    	}
		return -1;

    }

    /**
     * Search for an instructor in Course objects in the courseList that has the
     * same firstName, lastName, and officeNum info.
     * 
     * @param  firstName
     * @param  lastName
     * @param  officeNum
     * @return           the index of the Class object if found; -1 otherwise
     */
    public int instructorExists(String firstName, String lastName, String officeNum)
    {
    	
    	for (int i = 0; i<courseList.size(); i++) {
    		Instructor instructorEx = courseList.get(i).getInstructor();
    			if(instructorEx.getFirstName().equalsIgnoreCase(firstName) &&
    					instructorEx.getLastName().equalsIgnoreCase(lastName) &&
    					instructorEx.getOfficeNum().equalsIgnoreCase(officeNum))
    				return i; 
    	}
    	return -1;
    }

    /**
     * Add a Course object to the courseList and return true if such an object
     * is added successfully. Otherwise, return false. Two Courses are
     * considered duplicated if they have exactly the same course name and
     * university name.
     * 
     * @param  courseName the course name
     * @param  university the university of the course
     * @param  firstName  the Instructor's first name
     * @param  lastName   the Instructor's last name
     * @param  officeNum  the Instructor's office number
     * @return            true if the operation is successful; false otherwise
     */
    public boolean addCourse(String courseName, String university, String firstName, String lastName, String officeNum)
    {
        if (courseExists(courseName, university) == -1)
        {
            Instructor courseInstructor = new Instructor(firstName, lastName, officeNum);
            Course newCourse = new Course(courseName, university, courseInstructor);
            courseList.add(newCourse);
            return true;
        }

        return false;
    }

    /**
     * Remove a Course object with the given course name and university name.
     * 
     * @param  courseName the course name
     * @param  university the university of the course
     * @return            true if the object is removed successfully; false if
     *                    the object does not exist.
     */
    public boolean removeCourse(String courseName, String university)
    {
    	int i = courseExists(courseName, university);
   	 		if (i != -1)
   	 		{
   	 			Course course=  courseList.remove(i);
      
   	 				if(course !=null)
   	 					return true;
   	 		}
		return false;

     }

    /**
     * Sort the courseList by course names in alphabetical order. The method
     * calls the sort method in the Sorts class by using an object generated
     * from the CourseNameComparator class
     */
    public void sortByCourseName()
    {
    	//sorts courseList by course names in alphabetical order by calling on the sorts class
        Sorts.sort(courseList, new CourseNameComparator());


    }

    /**
     * Sort the courseList by Courses' instructors in the alphabetical order of
     * their last names and first names. The method calls the sort method
     * defined in the Sorts class by using an object generated from the
     * CourseInstructorComparator class.
     */
    public void sortByCourseInstructor()
    {
    	//sorts courseList by instructor name in alphabetical order by calling the sorts class
        courseList.sort(new CourseInstructorComparator());
    }

    /**
     * List all Course objects in courseList.
     * 
     * @return
     */
    public String listCourses()
    {

    	String allCourses = "\n";
    	
    	if(courseList.size()==0) {
    		allCourses = "No Course\n";
    } else {
    	for (int i = 0; i < courseList.size(); i++) {
    		allCourses += courseList.get(i).toString()+"\n" ;
    		}
    	
    	}
    	return allCourses+"\n";
    }

    /**
     * Close the Course management system by making the courseList empty.
     */
    public void closeCourseManagement()
    {

    	for(int i = 0; i < courseList.size();) 
    	{
    		courseList.remove(i);
    	}
    }
}



    
    
    
    
    
    