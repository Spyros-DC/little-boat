(ns little-boat.core
  (:require [reagent.core :as r]
            [hickory.core :as hr]
            [hickory.zip :as hz]
            [clojure.zip :as zip]
            [little-boat.svg :as svg]
))

;;this function takes as input html as a string
;;and returns the coresponding reagent component
(defn parsed-doc [html-str]
  (-> (hz/hiccup-zip (map hr/as-hiccup (hr/parse-fragment html-str))) zip/next zip/node))

;;this function renders the reagent component in the DOM
(defn show-doc [html-str]
  (r/render [parsed-doc html-str ] (js/document.getElementById "content") ))

(show-doc svg/html-str)

