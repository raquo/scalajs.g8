# $name$

----------------

Generated from [Scala.js + Laminar giter8 template](https://github.com/raquo/scalajs.g8)

name = $name$
package = $package$
dev_server_port = $dev_server_port$
include_laminar = $include_laminar$
include_CSS = $include_CSS$


## Usage

**One-time setup**

`npm install` – install JS dependencies

To run:

**In one terminal session:**

`sbt ~fastLinkJS` – to start incremental Scala.js compilation & linking. Keep it running.

You can also start `sbt`, and then run `~fastLinkJS` inside.

To quit incremental compilation, press `enter`. To then quit sbt, type `exit` and press `enter`.

**In another session:**

`npm run dev` – start [Vite](https://vite.dev/config/) dev server. Keep it running.

To quit vite dev server, press `q` and then press `enter`.

**In the browser:**

Navigate to http://localhost:$dev_server_port$

Open the browser's dev console – this is where logs and exceptions will go.


## IDE config

**Get an IDE or editor that understands Scala and shows you type info, lets you go-to-definition, etc. on day one.** Get into the habit of using those features to understand code and diagnose issues. This will help you understand the code better, be more self-sufficient in diagnosing issues, and overall improve your productivity and learning experience.

If using [IntelliJ](https://www.jetbrains.com/idea/):

- Install the free Scala plugin from the marketplace
- Go to `Preferences` -> `Build, Execution, Deployment` -> `Build tools` -> `sbt`
  - **enable** the **Use separate compiler output paths** setting. This keeps IntelliJ from interfering with sbt tasks like `~compile` and `~fastLinkJS` that you run in an external terminal shell. Without this, you may occasionally see inexplicable errors during incremental compilation.
  - Make sure both **Library sources** and **sbt sources** downloads are **enabled**.

IntelliJ UI, code navigation, and refactoring capabilities are generally very good, but Scala support still has some rough edges. IntelliJ may sometimes misunderstand your Scala code, and show an error or highlight an issue that does not actually exist. If in doubt, double-check that the compiler in your sbt session confirms the error. The compiler is the final authority.

Using [Metals](https://scalameta.org/metals) with editors like [VS Code](https://scalameta.org/metals/docs/editors/vscode/), [Vim](https://scalameta.org/metals/docs/editors/vim), etc. is another popular option. Metals is more faithful to the compiler, but its code navigation and refactoring capabilities are more limited compared to IntelliJ.


## Making changes

If you make any changes to build.sbt or plugins.sbt, run `reload` in the sbt shell to apply the changes.

To add Scala dependencies, add another line to `libraryDependencies` in `build.sbt`.

Make sure to use `%%%` instead of the usual `%%` for dependencies of Scala.js sbt projects. This adds `_sjs1` to the artifact name.

If you change the Scala version, make sure to also quit and re-start the vide dev server.

To install new runtime JS dependency, run `npm i yourDependencyName`.

If you only need the dependency at build time: `npm i --include=dev yourDependencyName`.

Want to add backend, more code examples, etc.? Check out [Laminar full stack demo](https://github.com/raquo/laminar-full-stack-demo).
