(ns routes
  (:use compojure)
  (:use config))

(defn load-view [request file]
	(let [params (:params request)
			  cookies (:cookies request)
			  session (:session request)
			  flash (:flash request)]
		(load-file (str "views/" file))))

(defroutes default-routes
	(ANY "/"
		(load-view request "index.clj"))
	(ANY "/about"
		(html "blah"))
	(ANY "/test"
		(str params "<br\\>" cookies "<br\\>" session "<br\\>" flash))
	(ANY "/*" [404 "Page not found"]))
