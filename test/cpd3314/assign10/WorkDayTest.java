/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>
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
public class WorkDayTest {

    public WorkDayTest() {
    }

    /**
     * Test of getDate method, of class WorkDay.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        WorkDay instance = new WorkDay();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class WorkDay.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "4";
        WorkDay instance = new WorkDay();
        instance.setDate(date);
        String result = instance.getDate();
        assertEquals(date, result);
    }

    /**
     * Test of getStartingTime method, of class WorkDay.
     */
    @Test
    public void testGetStartingTime() {
        System.out.println("getStartingTime");
        WorkDay instance = new WorkDay();
        String expResult = "";
        String result = instance.getStartingTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartingTime method, of class WorkDay.
     */
    @Test
    public void testSetStartingTime() {
        System.out.println("setStartingTime");
        String startingTime = "9:00";
        WorkDay instance = new WorkDay();
        instance.setStartingTime(startingTime);
        String result = instance.getStartingTime();
        assertEquals(startingTime, result);
    }

    /**
     * Test of getEndingTime method, of class WorkDay.
     */
    @Test
    public void testGetEndingTime() {
        System.out.println("getEndingTime");
        WorkDay instance = new WorkDay();
        String expResult = "";
        String result = instance.getEndingTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEndingTime method, of class WorkDay.
     */
    @Test
    public void testSetEndingTime() {
        System.out.println("setEndingTime");
        String endingTime = "5:00";
        WorkDay instance = new WorkDay();
        instance.setEndingTime(endingTime);
        String result = instance.getEndingTime();
        assertEquals(endingTime, result);
    }

    /**
     * Test of toString method, of class WorkDay.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        WorkDay instance = new WorkDay("4", "9:00", "5:00");
        String expResult = "4 : Work : 9:00-5:00";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
