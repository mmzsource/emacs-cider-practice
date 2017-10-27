(ns emacs-test.core)

(+ 5 5)

(reduce + [1 2 3 4])

(filter even? (range 10))

(:a {:a 1 :b 2})

(def customers [{:name "piet" :email "bla@bla.com"} {:name "kees" :city "NY"}])

(map :name customers)

(map (juxt :name :email) customers)

(sort-by (juxt :a :b) [{:a 1 :b 3} {:a 1 :b 2} {:a 2 :b 1}])
