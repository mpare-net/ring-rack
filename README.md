# ring-rack

Clojure library that implements Ruby's [Rack](http://www.rubydoc.info/github/rack/rack/master/file/SPEC) as a Clojure [Ring](https://github.com/ring-clojure/ring/blob/master/SPEC) handler function.

## Usage

Generic Rack application or middleware:

```clj
(require 'ring.rack)
(ring.rack/wrap-rack-handler rack-function) ;<- FIXME
```

Using a path to a Rack app (like Rails) or middleware:

```clj
(require 'ring.rack)
(ring.rack/rack-app "path/to/rails/app")
```



## License

Copyright © 2015 FIXME
