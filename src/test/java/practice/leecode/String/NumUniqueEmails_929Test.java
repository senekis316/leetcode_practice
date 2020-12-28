package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumUniqueEmails_929Test {

    @Test
    public void numUniqueEmails_1() {
        NumUniqueEmails_929 numUniqueEmails_929 = new NumUniqueEmails_929();
        assertEquals(2, numUniqueEmails_929.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    @Test
    public void numUniqueEmails_2() {
        NumUniqueEmails_929 numUniqueEmails_929 = new NumUniqueEmails_929();
        assertEquals(3, numUniqueEmails_929.numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"}));
    }

}