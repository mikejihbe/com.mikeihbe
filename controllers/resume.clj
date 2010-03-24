(ns resume
  (:use compojure)
  (:use compojure.validation.predicates)
  (:use routes)
  (use views)
  (:use mail))
  
(defn send-resume [request]
	(with-validated-params (:form-params request) 
			#(validation %
				[:requestor present? "Your name must be filled out"]
				[:email present? "Your email must be filled out"]
				[:company present? "Whom you represent must be filled out"]
				[:opportunity present? "The opportunity description must be filled out"])
		(if (validation-errors?)
			(load-view request "view-resume.clj")
			(binding [*msg-success* true]
				(mail-resume-requested (:form-params request))
				(load-view request "view-resume.clj")))))
