package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.Main_class;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class JunitTestCase {
	
	Main_class r = new Main_class();
			    	
     @Test
	 public void MatchFirstName() {
	 boolean result1=r.firstName("Ritesh");
	 assertEquals(result1,true);
		 }
}

