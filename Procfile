web: target/start -Dhttp.port=$PORT -DapplyEvolutions.default=true -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL
scheduledtick: java -Dconfig.file=conf/application.conf -DapplyEvolutions.default=true -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL -cp "target/universal/stage/lib/*" jobs.TickJob .
