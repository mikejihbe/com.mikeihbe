(ns mikeihbe
	(:use compojure)
	(:use routes)
	(:use config))
	
(defserver myserver
  {:port (config :server-port)} "/*" (servlet default-routes))

(defn up []
	; Ensure newest code is used
	(load "config")
	(load "routes")
	(load "views")
  (start myserver))
 
(defn down []
  (stop myserver))
