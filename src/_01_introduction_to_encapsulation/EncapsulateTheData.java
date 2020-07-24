package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public int getItemsReceived() {
		return itemsReceived;
	}
	public float getDegreesTurned() {
		return degreesTurned;
	}
	public String getNomenclature() {
		return nomenclature;
	}
	public Object getMemberObj() {
		return memberObj;
	}
	public void setItemsReceived(int n) {
		if (n < 0) {
			n = 0;
		}
		itemsReceived = n;
	}
	public void setDegreesTurned(float n) {
		if (n >= 0.0 && n <= 360.0) {
			degreesTurned = n;
		}
	}
	public void setNomenclature(String n) {
		if (n.isEmpty()) {
			n = " ";
		}
		nomenclature = n;
	}
	public void setMemberObj(Object n) {
		if (n.toString().equals(n)) {
			n = new Object();
		}
		memberObj = n;
	}
	@Test
	public void testItemsReceived() {
		assertEquals(getItemsReceived(), itemsReceived);
		setItemsReceived(5);
		assertEquals(getItemsReceived(), 5);
		setItemsReceived(-3);
		assertEquals(getItemsReceived(), 0);
	}
	
	@Test
	public void testDegreesTurned() {
		assertEquals(getDegreesTurned(), degreesTurned);
		setDegreesTurned(125);
		assertEquals(getDegreesTurned(), 125);
		setDegreesTurned(400);
		assertEquals(getDegreesTurned(), 125);
	}
	@Test
	public void testNomenclature() {
		assertEquals(getNomenclature(), nomenclature);
		setNomenclature("Pneumonoultramicroscopicsilivolcanoconiosis");
		assertEquals(getNomenclature(), "Pneumonoultramicroscopicsilivolcanoconiosis");
		setNomenclature("");
		assertEquals(getNomenclature(), " ");
	}
	@Test
	public void testMemberObj() {
		assertEquals(getMemberObj(), memberObj);
		EncapsulateTheData e = new EncapsulateTheData();
		setMemberObj(e);
		assertEquals(getMemberObj(), e);
		String s = "";
		setMemberObj(s);
		assertFalse(getMemberObj().equals(s));
	}
}
