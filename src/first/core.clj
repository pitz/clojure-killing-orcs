(ns first.core
    (:gen-class))

(defn -main
    "I don't do a whole lot ... yet."
    [& args]

    (if false
        (println "Fact, bears eat beets"))

    (when true
        (println "Fact")
        (println "bears")
        (println "... eat beets"))

    (when false
        (println "Fact, bears eat beets 2 "))
    
    (println "the-end"))