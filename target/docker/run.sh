#!/bin/sh

echo "********************************************************"
echo "Importing CA Root certificate"
echo "********************************************************"
export JAVA_HOME=/usr/lib/jvm/java-1.8-openjdk
keytool -importcert -noprompt -alias rootca -keystore $JAVA_HOME/jre/lib/security/cacerts -file /certs/ca.pem -storepass changeit

echo "********************************************************"
echo "Starting License Server"
echo "********************************************************"
java -jar /usr/local/licensingservice/sample-vaultconfig-1.0.1-SNAPSHOT.jar --spring.config.location=file:/props/