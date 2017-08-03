(defproject my-stuff "0.1.0-SNAPSHOT"
  :description "A tutorial for leiningen"
  :url "https://github.com/fjs138/my-stuff"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
		[clj-http "2.0.0"]]
  
;;:main ^:skip-aot my-stuff.core
  :main my-stuff.core 
;;:target-path "target/%s"
  
;;:profiles {:uberjar {:aot :all}})
  :profiles {:dev {:dependencies [[ring/ring-devel "1.4.0"]]}}
  :aot [my-stuff.core])
