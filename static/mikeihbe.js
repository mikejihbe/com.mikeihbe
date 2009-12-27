// Slideshow stuff

function slideSwitch() {
    var $active = $('#menu IMG.active');

    if ( $active.length == 0 ) $active = $('#menu IMG:last');

    var $next =  $active.next().length ? $active.next()
        : $('#menu IMG:first');

    $active.addClass('last-active');

    $next.css({opacity: 0.0})
        .addClass('active')
        .animate({opacity: 1.0}, 2000, function() {
            $active.removeClass('active last-active');
        });
}

$(document).ready(function(){
	setInterval("slideSwitch()", 6000 );
});

