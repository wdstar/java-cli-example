# java-cli-example
[![CircleCI](https://circleci.com/gh/wdstar/java-cli-example.svg?style=shield)](https://circleci.com/gh/wdstar/java-cli-example)
[![Known Vulnerabilities](https://snyk.io//test/github/wdstar/java-cli-example/badge.svg?targetFile=build.gradle)](https://snyk.io//test/github/wdstar/java-cli-example?targetFile=build.gradle)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=wdstar_java-cli-example&metric=alert_status)](https://sonarcloud.io/dashboard?id=wdstar_java-cli-example)

Java CLI example

## Development

1. Initialize a project.
    ```bash
    $ gradle init --type java-application
    ```
1. Test.
    ```bash
    $ ./gradlew test
    ```
1. Build JAR.
    ```bash
    # Better
    $ ./gradlew bootJar
    # This fat jar generation has a problem.
    #$ ./gradlew jar
    ```
1. Run.
    ```bash
    $ java -jar ./build/libs/java-cli-example-*.jar
    # with logback conf.
    $ java -Dlogback.configurationFile=./logback.groovy -jar ./build/libs/java-cli-example-*.jar
    ```
1. Generate reports.
    ```bash
    $ ./gradlew report
1. Analyze by SonarScanner
    ```bash
    # set access token
    $ cat ~/.gradle/gradle.properties 
    systemProp.sonar.login=<token>
    $ ./gradlew sonarqube
    ```
