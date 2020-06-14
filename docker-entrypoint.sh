#!/bin/sh
if [ -z "$JAVA_OPTS" ]; then
	JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"
else
	JAVA_OPTS="$JAVA_OPTS -Djava.security.egd=file:/dev/./urandom"
fi

if [ $DEBUG == "true" ]; then
	JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005" 
fi

if [ -z "$JAVA_PARAM" ]; then
	JAVA_PARAM="-p /app/:/app/modules/ -m com.pocs.modulespoc.application"
fi

exec java $JAVA_OPTS $JAVA_PARAM