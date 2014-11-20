/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cpd3314.assign10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class DayTest {
    
    public DayTest() {
    }

    /**
     * Test of getDate method, of class Day.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Day instance = new Day();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Day.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "4";
        Day instance = new Day();
        instance.setDate(date);
        String result = instance.getDate();
        assertEquals(date, result);
    }

    /**
     * Test of toString method, of class Day.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String date = "4";
        Day instance = new Day(date);
        String expResult = date;
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
