(defproject envoy "0.1.0"
  :description "Fork of tolitius/envoy that uses a newer version of http-kit"
  :url "https://github.com/m4ldonado/envoy"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "0.4.500"]
                 [cheshire "5.8.0"]
                 [http-kit "2.4.0-alpha6"]
                 [boot/core "2.7.2"]]
  :repl-options {:init-ns envoy.core})
