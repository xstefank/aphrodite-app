package org.jboss;

import org.jboss.set.aphrodite.Aphrodite;
import org.jboss.set.aphrodite.domain.Issue;

import java.net.URL;

public class AproditeMain {

    public static void main(String[] args) throws Exception {
        Aphrodite aphrodite = Aphrodite.instance();

        Issue issue = aphrodite.getIssue(new URL("https://issues.jboss.org/browse/JBEAP-3038"));
        System.out.println(issue);

        aphrodite.close();
    }
}
