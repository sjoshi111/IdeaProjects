web crawler - in Java Language
==============================
Project Overview
----------------
The crawler should be limited to one domain.
it will visit all pages within the domain, but not follow the links to external sites such as Google or Twitter.

Installation:
------------
To build run the below command on the project's root directory

    	mvn clean install

    	java -cp Web-Crawler-1.0-SNAPSHOT.jar WebCrawler https://wiprodigital.com

Sample O/P:
----------
https://wiprodigital.com
https://wiprodigital.com/who-we-are
https://wiprodigital.com/who-we-are/#masthead
https://wiprodigital.com/who-we-are/#wdteam-vid
https://wiprodigital.com/who-we-are/#wdteam_meetus
https://wiprodigital.com/who-we-are/#wdteam_leaders
https://wiprodigital.com/what-we-do
https://wiprodigital.com/who-we-are#wdteam_meetus
https://wiprodigital.com/what-we-do#work-three-circles-row
...

TODO:
-----
1. write JUNIT test
2. Add comments for each method
3. Used gradle for build
4. Code Refacoring, we can use advanced framework like spring boot