(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
 (if (= x nil) false
  (if (= x false) false true)))

(defn abs [x]
 (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
   (if (divides? 3 n) "fizz"
    (if (divides? 5 n) "buzz" ""))))

(defn teen? [age]
 (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
 (if (number? x) (* 2 x)
  (if (empty? x) nil
   (if (or (list? x) (vector? x)) (* 2 (count x)) true))))

(defn leap-year? [year]
  (and
   (or
    (not (divides? 100 year))
    (divides? 400 year))
   (divides? 4 year)))
