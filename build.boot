(def +version+ "0.1.15")

(set-env!
  :source-paths #{"src"}
  :dependencies '[[cheshire "5.8.0" :exclusions [org.clojure/clojure]]
                  [org.clojure/core.async "0.4.500" :exclusions [org.clojure/clojure]]
                  [http-kit "2.4.0-alpha6"]

                  ;; boot clj
                  [boot/core              "2.7.2"           :scope "provided"]
                  [adzerk/bootlaces       "0.1.13"          :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(bootlaces! +version+)

(task-options!
  push {:ensure-branch nil}
  pom {:project     'tolitius/envoy
       :version     +version+
       :description "Fork of toilitius/envoy that uses newer http-kit"
       :url         "https://github.com/tolitius/envoy"
       :scm         {:url "https://github.com/m4ldonado/envoy"}
       :license     {"Eclipse Public License"
                     "http://www.eclipse.org/legal/epl-v10.html"}})
