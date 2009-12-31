(ns view-resume
	(:use compojure)
	(:use views))

(html-view "Mike Ihbe - Resume" [] "Resume"
	(html
		[:div#main
			[:div.errors
				(error-summary)]
			[:div.msg-success
				(if *msg-success*
					(html "Thanks for your time, you can retrieve my resume" [:a {:href "/static/Resume - Mike Ihbe.pdf"} " here"]))]
			[:h2 "Hi, thanks for taking an interest"]
			[:p "I'd love to discuss your opportunity, but before I send you my resume, I have a few quick questions."]
			(form-to [:post "/resume"]
				[:table 
					[:tr
						[:td {:width "200px"} (label "requestor" "What's your name?")]
						[:td (text-field "requestor")]]
					[:tr
						[:td (label "email" "What's your email address?")]
						[:td (text-field "email")]]
					[:tr 
						[:td (label "company" "Who do you represent?")]
						[:td (text-field "company")]]
					[:tr 
						[:td (label "opportunity" "A brief description of the opportunity.")]
						[:td (text-area {:rows 10 :cols 50} "opportunity")]]]
				(submit-button "Send me your resume!")
			)
			]))