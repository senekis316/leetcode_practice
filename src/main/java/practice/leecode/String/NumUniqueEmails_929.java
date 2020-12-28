package practice.leecode.String;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails_929 {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueDomains = new HashSet<>();
        for (String email : emails) {
            String[] domains = email.split("@");
            String local = domains[0].replace(".", "");
            if (local.indexOf("+") > -1) {
                local = local.substring(0, local.indexOf("+"));
            }
            String network = domains[1];
            uniqueDomains.add(local + "@" + network);
        }
        return uniqueDomains.size();
    }

}
