import {defineConfig} from "vite";
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs";
import rollupPluginSourcemaps from "rollup-plugin-sourcemaps";
$if(include_CSS.truthy)$
import globResolverPlugin from "@raquo/vite-plugin-glob-resolver";
import importSideEffectPlugin from "@raquo/vite-plugin-import-side-effect";
$endif$

export default defineConfig({
  base: "/",
  publicDir: "public",
  plugins: [
    scalaJSPlugin({
      cwd: ".", // path to build.sbt
      projectID: "root" // scala.js project name in build.sbt
    }),
    $if(include_CSS.truthy)$
    globResolverPlugin({
      // See https://github.com/raquo/vite-plugin-glob-resolver
      cwd: __dirname,
      ignore: [
        'node_modules/**',
        'target/**'
      ]
    }),
    importSideEffectPlugin({
      // See https://github.com/raquo/vite-plugin-import-side-effect
      defNames: ['importStyle'],
      rewriteModuleIds: ['**/*.less', '**/*.css'],
      // verbose: true
    })
    $endif$
  ],
  build: {
    outDir: "dist",
    assetsDir: "assets", // path relative to outDir
    $if(include_CSS.truthy)$
    cssCodeSplit: false,  // false = Load all CSS upfront
    $endif$
    rollupOptions: {
      plugins: [rollupPluginSourcemaps()],
    },
    minify: "terser",
    sourcemap: true
  },
  server: {
    port: $dev_server_port$,
    strictPort: true,
    logLevel: "debug"
  }
})
