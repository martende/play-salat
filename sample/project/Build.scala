import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "sample"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "se.radley" %% "play-plugins-salat" % "1.0.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Only used to be able to develop locally, remove it!
      //resolvers += Resolver.file("Local Ivy", file("/Users/leon/.ivy2/local"))(Resolver.ivyStylePatterns),
      routesImport += "se.radley.plugin.salat.Binders._",
      templatesImport += "org.bson.types.ObjectId"
    )

}
