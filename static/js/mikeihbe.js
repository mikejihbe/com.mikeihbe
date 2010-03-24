// Slideshow stuff

function slideSwitch() {
    var $active = $('#menu DIV.active');

    if ( $active.length == 0 ) $active = $('#menu DIV:last');

    var $next =  $active.next().length ? $active.next()
        : $('#menu DIV:first').next();

    $active.addClass('last-active');

    $next.css({opacity: 0.0})
        .addClass('active')
        .animate({opacity: 1.0}, 3000, function() {
            $active.removeClass('active last-active');
        });
}

$(document).ready(function(){
	setInterval("slideSwitch()", 9000 );
});

