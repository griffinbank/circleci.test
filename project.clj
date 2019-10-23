(defproject griffinbank/circleci.test "0.5.0-alpha2"
  :description "clojure.test compatible test-runner"
  :url "https://github.com/circleci/circleci.test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.xml "0.2.0-alpha5"]]
  :profiles {:alpha-data-xml
             {:dependencies [[org.clojure/data.xml "0.2.0-alpha5"]]}}
  :aliases {"test" ["run" "-m" "circleci.test/dir" :project/test-paths]
            "tests" ["run" "-m" "circleci.test"]
            "retest" ["run" "-m" "circleci.test.retest"]})
