package com.principles.substitute;
import java.util.List;
import java.util.ArrayList;
public class Substitute {

	public static void main(String[] args) {
		List<GetTech> dev = new ArrayList<GetTech>();
		dev.add(new AndroidDeveloper("Harry",2000));
		dev.add(new WebDeveloper("Ron",2000));
		dev.add(new IosDeveloper("Potter",2000));
		for(GetTech displayhike : dev) {
			displayhike.displayTech();
		}
	}

}
