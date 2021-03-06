import static ch.qos.logback.classic.Level.*

import java.nio.charset.Charset

import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy
import ch.qos.logback.classic.encoder.PatternLayoutEncoder

def defaultCharset = Charset.forName("UTF-8")
def defaultHistory = 365
def defaultFilename = "./java-cli-example.log"

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    charset = defaultCharset
    pattern = "%d{HH:mm:ss.SSS} [%thread] %highlight(%-5level) %cyan(%logger{36}) - %msg%n"
  }
}

/*
// Note: log file is created by just appender definition.
appender("FILE", RollingFileAppender) {
  fileName = defaultFilename

  encoder(PatternLayoutEncoder) {
    charset = defaultCharset
    pattern = "%d [%thread] %-5level %logger{36} - %msg%n"
  }

  rollingPolicy(TimeBasedRollingPolicy) {
    maxHistory = defaultHistory
    fileNamePattern = "${defaultFilename}.%d{yyyy-MM-dd}.gz"
  }
}
*/

// default level: DEBUG
root INFO, ["CONSOLE"]
