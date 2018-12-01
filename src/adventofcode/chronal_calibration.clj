(ns adventofcode.chronal-calibration
    (:require [clojure.java.io :as io]))

(defn parse-input [{:keys [resource]}]
  (->
    (slurp (io/resource resource))
    (clojure.string/split #"\n")))

(->>
 (parse-input {:resource "chronal-calibration/input.txt"})
 (map read-string)
 (reduce +))


