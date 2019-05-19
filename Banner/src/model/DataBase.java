package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataBase {
	
	public Attendee root;
	public Attendee firstAttendee;
	public Attendee firstParticipant;
	
	public DataBase() {
		root = null;
		firstAttendee = null;
		firstParticipant = null;
	}
	
	public void loadFile(String filename) throws IOException {
		String f;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
		while((f=bufferedReader.readLine())!=null) {
			String [] r =f.split(",");
			Attendee q = new Attendee(Integer.parseInt(r[0]),r[1],r[2],r[3],r[4],r[5],r[6],r[7]);
			//add Tree
		}
		bufferedReader.close();
	}

	public boolean isEmpty() {
		return (root == null);
	}
	
	public Attendee searchAssitant(int a) {
		Attendee r = null;
		if (!isEmpty()) {
			if (a == root.getId()) {
				return root;
			} else {
				if (a < root.getId()) {
					r = searchAssitant(root.getLeft().getId());
				} else {
					r = searchAssitant(root.getRight().getId());
				}
			}
		}
		return r;
	}
	
}
