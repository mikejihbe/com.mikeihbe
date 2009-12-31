(ns views
	(:use compojure)
	(:use views))

(html-view "Mike Ihbe - About" ["/static/mikeihbe.css"] "About"
	(html
		"<style type='text/css'>#menu {background-image: url('/static/images/manatee.jpg'); background-repeat: no-repeat;} </style>"
		[:div#main
			[:h2 "A brief introduction"]
			[:p "Hi, I'm Mike Ihbe.  I'm a kick-ass software engineer and entrepreneur.  
					Right now, I'm establishing myself in Silicon Valley and am the senior engineer at " [:a {:href "http://younoodle.com"} "YouNoodle"] "."]
			[:p "I was born and raised in Minnesota, the heart of the midwest.  That gives me a certain practicality and friendliness that most people seem to enjoy."]
			[:p "I spend my time constantly expanding my horizons.  I enjoy making new friends, reading, working with new technologies, networking, traveling, and brainstorming new ways to change the world."]
			[:h2 "Professional"]
			[:p "In the workplace, I enjoy working with a team where I can be a significant contributor - Making noticeable business impact while delivering quality software to my clients.  
					I take pleasure in both teaching and learning, so I also enjoy building teams (and culture) from the ground up."]
			[:p "I'm always looking for the next big thing, so if you have opportunities you'd like to discuss, don't hesitate to contact me."]
			[:p "It's probably pretty clear from my website here, but just in case it's not, my speciality is not UI design.  It's software architecture: complex system design and framework level code.  
					I graduated with Honors from the University of Michigan, Ann Arbor, with a degree in Computer Science Engineering, so my domain knowledge is extensive.  Including, but not 
					limited to, several areas of interest: architecture, algorithms, artificial intelligence, and project management."] 
			[:ul
				[:li "Languages"
					[:ul
						[:li "Qualified"
							[:ul
								[:li "PHP"]
								[:li "C++"]
								[:li "Ruby"]
								[:li "SQL"]]]
						[:li "Experienced"
							[:ul
								[:li "Java"]
								[:li "Clojure"]
								[:li "C#"]
								[:li "Perl"]
								[:li "Python"]]]]]
				[:li "Applications"
					[:ul
						[:li "MySQL"]
						[:li "Apache"]
						[:li "SOLR/Lucene"]
						[:li "nginx"]]]]
				
								
			[:h2 "Personal"]
			[:ul
				[:li "Socializing"]
				[:li "Technology"
					[:ul
						[:li "Computers"]
						[:li "Cleantech"]
						[:li "Mobile"]]]
				[:li "Economics"]
				[:li "Photography"]
				[:li "Cooking"]
				[:li "Sporting"
					[:ul
						[:li "Skiing"]
						[:li "Dance"]
						[:li "Boating"]
						[:li "Ultimate Frisbee"]
						[:li "Soccer"]
						[:li "Volleyball"]]]]
			]))