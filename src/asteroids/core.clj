(ns asteroids.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; TODO: refactor
(defn radius [x]
  (if (number? (:radius x))
    (:radius x)
    ((:radius x))))

;; TODO: refactor
(defn position [x]
  (if (sequential? (:position x))
    (:position x)
    ((:position x))))

(defn intersects? [a b]
  (let [min-dist (+ (radius a) (radius b))
        dist     (map - (position a) (position b))]
    (> (* min-dist min-dist) (length-squared dist))))


