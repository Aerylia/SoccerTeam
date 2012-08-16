/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import java.io.*;
import soccerTeam.logic.DataPortal;

/**
 *
 * @author Arianne
 */
public class DataManager {
    
    public static void load(String filename) throws FileNotFoundException, IOException{
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
		in.close();

    }
    
    public static void save(String filename) throws IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
		/* out.writeObject(coach);
		out.writeObject(coach.getTimeline());
		out.writeObject((Integer)coach.getTimeline().getTeam().size());
		for(Iterator<Person> it = coach.getTimeline().getTeam().iterator(); it.hasNext();){
			out.writeObject(it.next());			
		}
		out.writeObject((Integer)coach.getTimeline().getMatches().size());
		for(Iterator<Match> it = coach.getTimeline().getMatches().iterator(); it.hasNext();){
			out.writeObject(it.next());			
		} */
		out.close();
	}
	
	/**
	 * Zou het bestand met naam filename moeten verwijderen, maar doet dit niet.
	 * 
	 * @param fileName
	 * @throws IllegalArgumentException
	 * @throws NoException 
	 */
	public static void delete(String fileName) throws IllegalArgumentException{
            // A File object to represent the filename
	    File f = new File(fileName);

	    // Make sure the file or directory exists and isn't write protected
	    if (!f.exists()){
	      throw new IllegalArgumentException(
	          "Delete: no such file or directory: " + fileName);
	    }
	    if (!f.canWrite()){
	      throw new IllegalArgumentException("Delete: write protected: "
	          + fileName);
	    }
	    // If it is a directory, make sure it is empty
	    if (f.isDirectory()) {
	      String[] files = f.list();
	      if (files.length > 0)
	        throw new IllegalArgumentException(
	            "Delete: directory not empty: " + fileName);
	    }

	    // Attempt to delete it
	    boolean success = f.delete();

	    if (!success){
	      throw new IllegalArgumentException("Delete: deletion failed");
	    }
	}
}

