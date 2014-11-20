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
public class OffDayTest {

    public OffDayTest() {
    }

    /**
     * Test of getDate method, of class OffDay.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        OffDay instance = new OffDay();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class OffDay.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "4";
        OffDay instance = new OffDay();
        instance.setDate(date);
        String result = instance.getDate();
        assertEquals(date, result);
    }

    /**
     * Test of getPlans method, of class OffDay.
     */
    @Test
    public void testGetPlans() {
        System.out.println("getPlans");
        OffDay instance = new OffDay();
        String expResult = "";
        String result = instance.getPlans();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlans method, of class OffDay.
     */
    @Test
    public void testSetPlans() {
        System.out.println("setPlans");
        String plans = "Homework";
        OffDay instance = new OffDay();
        instance.setPlans(plans);
        String result = instance.getPlans();
        assertEquals(plans, result);
    }

    /**
     * Test of toString method, of class OffDay.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        OffDay instance = new OffDay("4", "Homework");
        String expResult = "4 : Off : Homework";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
