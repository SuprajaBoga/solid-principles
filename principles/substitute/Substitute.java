package com.principles.substitute;
import java.util.List;
import java.util.ArrayList;
public class Substitute {

	public static void main(String[] args) {
		List<ITechnologies> developers = new ArrayList<ITechnologies>();
		developers.add(new AndroidDeveloper("Harry",2000));
		developers.add(new WebDeveloper("Ron",2000));
		developers.add(new IosDeveloper("Potter",2000));
		for(ITechnologies displayHike : developers) {
			displayHike.displayTechnologies();
		}
	}

}
