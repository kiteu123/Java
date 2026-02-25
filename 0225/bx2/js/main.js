$(function () {
    var slider = $('.bxslider').bxSlider({
        auto: true,
        autoHover: true,
        pause: 3000,
        controls: false,
        pager: false,
        onSlideBefore: function ($slideElement, oldIndex, newIndex) {
            $('#current-slide').text(newIndex + 1);
        }
    });

    var totalSlides = slider.getSlideCount();
    $('#total-slides').text(totalSlides);

    $('.next').click(function (e) {
        e.preventDefault();
        slider.goToNextSlide();
    });
    $('.prev').click(function (e) {
        e.preventDefault();
        slider.goToPrevSlide();
    });

    var isPaused = false;
    $('.pause').click(function (e) {
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
})