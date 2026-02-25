$(function () {
    var slider = $('.bxslider').bxSlider({
        auto: true,
        pager: false,
        controls: false,
        pause: 2000,
        autoHover: true,
        onSlideAfter: function ($slideElement, oldIndex, newIndex) {
            $('#current-slide').text(newIndex + 1);
        }
    });

    var isPaused = false;

    $('.prev').on('click', function (e) {
        e.preventDefault();
        slider.goToPrevSlide();
    });

    $('.next').on('click', function (e) {
        e.preventDefault();
        slider.goToNextSlide();
    });

    $('.pause').on('click', function (e) {
        e.preventDefault();

        if (!isPaused) {
            slider.stopAuto();
            $(this).addClass('on');
            isPaused = true;
        } else {
            slider.startAuto();
            $(this).removeClass('on');
            isPaused = false;
        }
    });

});