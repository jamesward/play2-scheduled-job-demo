web: target/universal/stage/bin/play2-scheduled-job-demo -Dhttp.port=$PORT -DapplyEvolutions.default=true -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL
scheduledtick: java -Dconfig.file=conf/application.conf -DapplyEvolutions.default=true -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL -cp "target/universal/stage/lib/*" jobs.TickJob .
