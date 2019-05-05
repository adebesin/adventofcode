(ns adventofcode.chronal-calibration
    (:require [clojure.java.io :as io]))

(defn parse-input [{:keys [resource]}]
  (->
    (slurp (io/resource resource))
    (clojure.string/split #"\n")))

(def frequency
  (->>
    (parse-input {:resource "chronal-calibration/input.txt"})
    (map read-string)))

(frequencies (reductions + frequency))

(frequencies [1 2])


(reduce (fn [acc x] (if (odd? x) (reduced x) (* acc x))) 1 (range 10))