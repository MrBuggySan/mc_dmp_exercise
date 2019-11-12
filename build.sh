#!/bin/bash

javac -d build/ solution/*.java 
javac -cp build/lib/junit-4.13-rc-1.jar:build/ -d build/ test/*.java


#run test after solution compilation
# this step can be separated to another script 
echo running tests...
java -cp build/lib/junit-4.13-rc-1.jar:build/lib/hamcrest-core-1.3.jar:build/ org.junit.runner.JUnitCore solution.test.StringHelperTest solution.test.FindPermTest

