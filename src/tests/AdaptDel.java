package tests;

import oldCode.NosrepInt;
import oldCode.Person;

public class AdaptDel implements NosrepInt {
	
	private Person person;
	
	public AdaptDel(Person person) {
		super();
		this.person = person;
	}

	@Override
	public String youWho() {
		// TODO Auto-generated method stub
		return person.whoAreYou();
	}

}
