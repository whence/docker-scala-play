// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.2")

// Scala style plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")

// SBT coverage plugin
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.1")

// Flyway plugin
addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.2.1")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

// There is an issue syncing the binary with the sbt-plugin-releases repo, so in the meantime add following
resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)

resolvers += "Flyway" at "http://flywaydb.org/repo"
