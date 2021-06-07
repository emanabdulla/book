(ns book.core
  [:use [tawny.owl]]
  [:require [book.book]])


(defn -main [& args]
  (save-ontology book.book/book "book.omn")
(save-ontology pizzaontology "pizza.owl" :owl))
