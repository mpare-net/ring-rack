(defproject clj-jruby-rack "0.1.0-SNAPSHOT"
  :description "Clojure Ring handler implementation of Ruby's Rack webapp spec"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.jruby/jruby "9.0.0.0"]]
  :global-vars {*warn-on-reflection* true}
  ;; PATH=`pwd`/target/bundler/bin:$PATH GEM_HOME=`pwd`/target/bundler lein gem install rails
  ;; PATH=`pwd`/target/bundler/bin:$PATH GEM_HOME=`pwd`/target/bundler lein rails new hello
  ;; PATH=`pwd`/target/bundler/bin:$PATH GEM_HOME=`pwd`/target/bundler lein bundle install --gemfile=hello/Gemfile
  ;; PATH=`pwd`/target/bundler/bin:$PATH GEM_HOME=`pwd`/target/bundler lein repl
  :aliases {"gem"    ["run" "-m" "org.jruby.Main" "-S" "gem"]
            "bundle" ["run" "-m" "org.jruby.Main" "-S" "bundle"]
            "rails"  ["run" "-m" "org.jruby.Main" "-S" "rails"]})
