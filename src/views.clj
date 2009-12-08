(ns views
	(:use compojure))

; TODO: handle arbitrary includes
(defn make-header [title includes]
	(html [:head
		[:meta {:http-equiv "Content-type" :content "text/html;charset=UTF-8"}]
		[:title title]
		(mapcat include-js (filter #(.endsWith % ".js") includes))
		(mapcat include-css (filter #(.endsWith % ".css") includes))]))

(defn nav-bar [current] 
	(let [buttons ["Home" "About" "Resume" "Code" "Contact"]]
		(html 
			[:div#head
				[:div#navbar
					(mapcat #(html [:div {:id %1 :class (if (= %1 current) "navbtn" "selected-navbtn")} 
													 [:a {:href (str "/" (.toLowerCase %1))} %1]])
										buttons)]])))

(defn html-view [title includes body]
	(html (:xhtml-strict doctype)
   	[:html (make-header title includes) [:body body]]))

