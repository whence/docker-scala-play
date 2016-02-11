name := """api"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  filters,
  cache,
  ws,
  "com.typesafe.play"          %% "play-slick"               % "1.1.1"     withSources(),
  "com.typesafe.play"          %% "play-ws"                  % "2.4.2"     withSources(),
  "org.scalatest"              %% "scalatest"                % "2.2.5"     % "test" withSources(),
  "org.scalatestplus"          %% "play"                     % "1.4.0-M4"  % "test" withSources(),
  "de.leanovate.play-mockws"   %% "play-mockws"              % "2.4.0"     % "test",
  "org.mockito"                %  "mockito-core"             % "1.10.19"   % "test",
  "org.postgresql"             %  "postgresql"               % "9.4-1203-jdbc42",
  "com.jason-goodwin"          %% "authentikat-jwt"          % "0.4.1"     withSources()
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Scala coverage config
coverageExcludedPackages := "<empty>;Reverse.*;router.Routes.*;views.html\\.*;"
coverageMinimum := 80
coverageFailOnMinimum := true

scalacOptions ++= Seq("-language:implicitConversions")
