Simple Play 2 App with a Job
============================

This example shows how to run a scheduled job in a Play app either in the web process or outside the web process (e.g. an external scheduler like [Heroku's Scheduler Addon](https://elements.heroku.com/addons/scheduler).

## Running Locally

By default, when running the web app locally the Tick runs every second:

    ./sbt ~run

> You should see "tick tock" every second in the STDOUT logs.

To run just a single Tick as a standalone process, run:

    ./sbt runMain jobs.TickJob

> You should only see a single "tick tock" and then the process exits.


## Running on Heroku

1. [![Deploy on Heroku](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)
1. Open the *Resources* tab in your app's dashboard: `https://dashboard.heroku.com/apps/YOUR APP NAME/resources`
1. Click on the *Heroku Scheduler* Add-on
1. Add a new scheduled task with `tick` as the command / task name
1. Check your app's logs to see the scheduled tick: `https://dashboard.heroku.com/apps/YOUR APP NAME/logs`
