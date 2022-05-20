# Why do we use logging?

When we develop an application say for instance you have 3 tasks and 3 developers.
Every developer does one task. Every developer creates his/her branch and works
individually on their task and prepares it. Also every developer makes his/her own logs
to show their results to analyze the flow code and catch if there are
any unexpected results or breaks in the flow.

# Which log levels are in Log4j?

Together, there are 8 log levels.

- All - To log all events
- Debug - A general debugging event
- Error - An error in the application, possibly recoverable
- Fatal - A severe error that will prevent the application from continuing
- Info - An event for informational purposes
- Trace - A fine-grained debug message, typically capturing the flow through the application.
- Warn - An event that might possibly lead to an error
- OFF - no events will be logged

# Which configuratinoptions does Log4j have?

With an XML, JSON, YAML configuration file you can configure your program.
We can do it programmitically as well. Log4j has the ability to automatically configure
itself during initialization. It has an order to look for the configuration file in the application.
Log4j will provide a default configuration if it cannot locate a configuration file.