/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FacebookTest;

import Facebook.SimpleTest;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTestTest {

	String[] input;
	@Test
	public final void testMain_pass_1() {
		SimpleTest.main(null);	
	}
	@Test
	public final void testMain_pass_2(){
		SimpleTest.main(input);
	}
	
}