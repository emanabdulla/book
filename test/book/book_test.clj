(ns book.book-test
    (:use [clojure.test])
    (:require
     [book.book :as ont]
     [tawny.owl :as o]
     [tawny.reasoner :as r]
     [tawny.fixture :as f]))

(use-fixtures :each (f/reasoner :hermit))

(deftest reasonable
  (is (r/consistent? book.book/book))
  (is (r/coherent? book.book/book)))
