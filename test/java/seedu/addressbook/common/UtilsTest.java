package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
	
	/*
	 * Method inputs a null object and checks if isAnyNull method returns true
	 */
	@Test
	public void test_isAnyNull_SingleNullObject(){
		Object item=null;
		boolean result=Utils.isAnyNull(item);
		assertTrue(result);
	}
	
	/*
	 * Method inputs an array of objects containing a single null object and checks if isAnyNull method returns true
	 */
	@Test
	public void test_isAnyNull_ArraySingleNullObject(){
		ArrayList<Integer> testList=new ArrayList<Integer>();
		testList.add(345);
		testList.add(0);
		testList.add(null);
		boolean result=Utils.isAnyNull(testList.get(0), testList.get(1), testList.get(2));
		assertTrue(result);
	}
	
	/*
	 * Method inputs an array of objects containing multiple null objects and checks if isAnyNull method returns true
	 */
	@Test
	public void test_isAnyNull_ArrayMultipleNullObject(){
		ArrayList<Integer> testList=new ArrayList<Integer>();
		testList.add(null);
		testList.add(null);
		testList.add(0);
		boolean result=Utils.isAnyNull(testList.get(0), testList.get(1), testList.get(2));
		assertTrue(result);
	}
	
	/*
	 * Method inputs a single non null object and checks if isAnyNull method returns false
	 * 
	 */
	@Test
	public void test_isAnyNull_SingleNonNullObject(){
		String item="Test";
		boolean result=Utils.isAnyNull(item);
		assertFalse(result);
	}
	
	/*
	 * Method inputs an array of non null objects and checks if isAnyNull method returns false 
	 */
	@Test
	public void test_isAnyNull_ArrayNonNullObject(){
		ArrayList<Integer> testList=new ArrayList<Integer>();
		testList.add(000);
		testList.add(001);
		testList.add(002);
		boolean result=Utils.isAnyNull(testList.get(0), testList.get(1), testList.get(2));
		assertFalse(result);
	}

	/*
	 * Method inputs array of unique objects and checks if elementsAreUnique returns true
	 */
	@Test
	public void test_elementsAreUnique_ArrayUnique(){
		ArrayList<Integer> testList=new ArrayList<Integer>();
		testList.add(000);
		testList.add(001);
		testList.add(002);
		boolean result=Utils.elementsAreUnique(testList);
		assertTrue(result);
	}
	
	/*
	 * Method inputs array of non unique objects and checks if elementsAreUnique returns false
	 */
	@Test
	public void test_elementsAreUnique_ArrayNonUnique(){
		ArrayList<Integer> testList=new ArrayList<Integer>();
		testList.add(000);
		testList.add(001);
		testList.add(000);
		boolean result=Utils.elementsAreUnique(testList);
		assertFalse(result);
	}
}