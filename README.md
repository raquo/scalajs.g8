# Scala.js giter8 template

This is bare-bones template for a [Scala.js](https://www.scala-js.org/) web frontend project.

First, install [sbt](https://www.scala-sbt.org/1.x/docs/Setup.html) and [npm](https://docs.npmjs.com/downloading-and-installing-node-js-and-npm).

Run `sbt new raquo/scalajs.g8` and answer the questions:

- Project name
- Package name
- Dev server port
- Include [Laminar](https://laminar.dev/)?
- Include CSS build setup?

If not sure, say "yes" to Laminar and CSS (you can always remove later if not needed).

Once the command finishes, go into your new project's folder, and **read its `README.md` for further instructions.**

Want to add backend, more code examples, etc.? Check out [Laminar full stack demo](https://github.com/raquo/laminar-full-stack-demo).

This project uses Scala 3, but changing to Scala 2 is only a few lines of code, e.g. if needed to investigate a bug.


## Known issues

- Giter8 prints out "Skipping ignored file" warnings if you answer "no" to Laminar or CSS [giter8#932](https://github.com/foundweekends/giter8/issues/932)
- Giter8 prints out SLF4J warnings [giter8#931](https://github.com/foundweekends/giter8/issues/931)

These are harmless, the output is good. If the issues are marked as fixed but your Giter8 still prints those warnings, try updating sbt.


## TODO

- Add more optional features
  - Stuff like backends, scalafmt, tests, BuildInfo sbt plugin
  - Should be useful for:
    - First-time users' app projects
    - One-off experimental app projects
    - Sharing bug reproductions
    - Starting new library projects
- Extract the non-project-specific docs like IDE setup somewhere else
- Promote this template in Laminar docs / "quick start" page etc.


## Public Domain

To the extent possible under law, the author(s) have dedicated all copyright and related and neighboring rights to this template to the public domain worldwide. This template is distributed without any warranty. See https://creativecommons.org/publicdomain/zero/1.0/.
