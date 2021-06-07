

(ns book.book
(:use [tawny.owl])
  (:require [tawny.owl :refer :all]))


(defontology walk_through
  :iri "http://purl.org/ontolink/walk_through")

(defclass Book)
(defclass TakeWing
  :super Book)

(defclass Subject)
(defoproperty about)

(as-subclasses 
 Subject
:disjoint
(defclass Bird)
(defclass Ontology))

(defclass TawnyOWL

:super Ontology)

(save-ontology "o.omn" :omn)
