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
public class SchoolDayTest {

    public SchoolDayTest() {
    }

    /**
     * Test of getDate method, of class SchoolDay.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        SchoolDay instance = new SchoolDay();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class SchoolDay.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "4";
        SchoolDay instance = new SchoolDay();
        instance.setDate(date);
        String result = instance.getDate();
        assertEquals(date, result);
    }

    /**
     * Test of getHomework method, of class SchoolDay.
     */
    @Test
    public void testGetHomework() {
        System.out.println("getHomework");
        SchoolDay instance = new SchoolDay();
        String expResult = "";
        String result = instance.getHomework();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHomework method, of class SchoolDay.
     */
    @Test
    public void testSetHomework() {
        System.out.println("setHomework");
        String homework = "Study for Finals";
        SchoolDay instance = new SchoolDay();
        instance.setHomework(homework);
        String result = instance.getHomework();
        assertEquals(homework, result);
    }

    /**
     * Test of toString method, of class SchoolDay.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String date = "4";
        String homework = "Study for Finals";
        SchoolDay instance = new SchoolDay(date, homework);
        String expResult = "4 : School : Study for Finals";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
