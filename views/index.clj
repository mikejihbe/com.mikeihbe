(ns views
	(:use compojure)
	(:use views))

(html-view "Mike Ihbe" ["mikeihbe.css"] 
	(html
		(nav-bar "Home")
		[:div#tumblr
			[:iframe {:src "http://mikeihbe.tumblr.com" :width "800px"}]]))