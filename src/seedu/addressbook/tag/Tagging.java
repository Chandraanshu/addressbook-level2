package seedu.addressbook.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	private Person person;
	private Tag tag;
	private String operation;
	private String value;
	
	public Tagging (Person person, Tag tag, String operation){
		this.tag=tag;
		this.person=person;
		this.operation=operation;
	}
	
	public void changeTag(){
		String sign;
		if(this.operation=="DELETED"){
			sign="-";
		}
		else{
			sign="+";
		}
		value=value+" " +person.getName() + " " + tag.toString() + "\n"; 
	}
	public String toString(){
		return value;
	}
}
