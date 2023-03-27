// Name: T.J.
// Description: This class sorts both the instructors and courses classes comparators that were made. 

import java.util.Comparator;
import java.util.ArrayList;

public class Sorts
{
    public static void sort(ArrayList<Course> courseList, Comparator<Course> xComparator)
    {
    	 for (int i=1; i < courseList.size(); i++) {
    		 Course elementI = courseList.get(i);
    		 int j = i; 
    		 while (j > 0) {
    			 Course elementJ =courseList.get(j-1);
    			 	
    			 if(xComparator.compare(elementI, elementJ) >= 0) {
    				 break; 
    			 }
    			 courseList.set(j, elementJ);
    			 j--;
    		 }
    		 courseList.set(j, elementI);
    	 }
    } 
} 
